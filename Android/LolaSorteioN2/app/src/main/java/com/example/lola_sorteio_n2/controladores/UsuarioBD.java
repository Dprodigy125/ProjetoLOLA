package com.example.lola_sorteio_n2.controladores;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.lola_sorteio_n2.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBD extends SQLiteOpenHelper implements IUsuarioBD {
        Context contexto;
        private List<Usuario> usuarioList = new ArrayList<>();

        public UsuarioBD(@Nullable Context context, @Nullable String name,
                         @Nullable SQLiteDatabase.CursorFactory factory, int version) {
                super(context, name, factory, version);
                this.contexto = context;
        }

    public static void OnCreate() {
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE usuarios (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "email TEXT, " +
                "senha TEXT, " +
                "nome TEXT, " +
                "endereco TEXT, " +
                "estado TEXT, " +
                "cidade TEXT, " +
                "tel INTEGER, " +
                "diaev INTEGER )";
        sqLiteDatabase.execSQL( sql );
        String insert = "INSERT INTO usuarios VALUES (null, " +
                "'teste@gmail.com', " +
                "'teste123', " +
                "'Teste', " +
                "'Rua Teste', " +
                "'TST', " +
                "'Cidade Teste', 111111, 23)" ;
        sqLiteDatabase.execSQL( insert );
        insert = "INSERT INTO usuarios VALUES (null, " +
                "'teste2@gmail.com', " +
                "'teste1234', " +
                "'Teste2', " +
                "'Rua Teste2', " +
                "'TSTS', " +
                "'Cidade Teste2', 1111131, 24)" ;
        sqLiteDatabase.execSQL( insert );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public Usuario elemento(int id) {
            SQLiteDatabase database = getReadableDatabase();
            String sql = "SELECT * FROM usuarios WHERE _id=" + id;
            Cursor cursor = database.rawQuery(sql,null);
            try {
                if (cursor.moveToNext())
                    return extractUser(cursor);
                else
                    return null;
            }catch (Exception e){
                Log.d("TAG","Error elemento(id) UserBD" + e.getMessage() );
                throw e;
            } finally {
                if (cursor != null) cursor.close();
            }
    }

    private Usuario extractUser(Cursor cursor) {
            Usuario usuario = new Usuario();
            usuario.setId( cursor.getInt(0));
            usuario.setEmail( cursor.getString(1));
            usuario.setSenha( cursor.getString(2));
            usuario.setNome( cursor.getString(3));
            usuario.setEndereco( cursor.getString(4));
            usuario.setEstado( cursor.getString(5));
            usuario.setCidade( cursor.getString(6));
            usuario.setTel( cursor.getInt(7));
            usuario.setDiaev( cursor.getInt(8));
            return usuario;
    }

    @Override
    public Usuario elemento(String email) {
        SQLiteDatabase database = getReadableDatabase();
        String sql = "SELECT * FROM usuarios WHERE email='" + email + "'";
        Cursor cursor = database.rawQuery(sql,null);
        try {
            if (cursor.moveToNext())
                return extractUser(cursor);
            else
                return null;
        }catch (Exception e){
            Log.d("TAG","Error elemento(email) UserBD" + e.getMessage() );
        } finally {
            if (cursor != null) cursor.close();
        }
        return null;
    }

    @Override
    public List<Usuario> lista() {
            SQLiteDatabase database = getReadableDatabase();
            String sql = "SELECT * FROM usuarios ORDER BY nome ASC";
            Cursor cursor = database.rawQuery(sql, null);
            if( cursor.moveToFirst()) {
                do{
                    usuarioList.add(
                            new Usuario( cursor.getInt(0),
                                    cursor.getString(1),
                                    cursor.getString(2),
                                    cursor.getString(3),
                                    cursor.getString(4),
                                    cursor.getString(5),
                                    cursor.getString(6),
                                    cursor.getInt(7),
                                    cursor.getInt(8) )
                    ); } while(cursor.moveToNext() );
            }
            cursor.close();
            return usuarioList;
    }

    @Override
    public void add(Usuario user) {
            SQLiteDatabase database = getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("email", user.getEmail() );
            values.put("senha", user.getSenha() );
            values.put("nome", user.getNome() );
            values.put("endereco", user.getEndereco() );
            values.put("estado", user.getEstado() );
            values.put("cidade", user.getCidade() );
            values.put("tel", user.getTel() );
            values.put("diaev", user.getDiaev() );
            database.insert("usuarios", null,values);
    }

    @Override
    public void atualizar(int id, Usuario user) {
        SQLiteDatabase database = getWritableDatabase();
        String[] parametros = { String.valueOf(id) };

        ContentValues values = new ContentValues();
        values.put("email", user.getEmail() );
        values.put("senha", user.getSenha() );
        values.put("nome", user.getNome() );
        values.put("endereco", user.getEndereco() );
        values.put("estado", user.getEstado() );
        values.put("cidade", user.getCidade() );
        values.put("tel", user.getTel() );
        values.put("diaev", user.getDiaev() );
        database.update("usuarios", values, "_id=?", parametros);
    }

    @Override
    public void apagar(int id) {
        SQLiteDatabase database=getWritableDatabase();
        String[] parametros = { String.valueOf(id) };

        database.delete("usuarios", "_id=?", parametros);
    }
} //UsuarioBD
