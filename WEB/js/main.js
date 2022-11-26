const cep = document.querySelector("#cep")

const showData = (result)=>{
  for(const campo in result){
    if(document.querySelector('#'+campo)){
      document.querySelector("#"+campo).value = result[campo]
    }
  }
}
cep.addEventListener("blur",(e)=>{
  let search = cep.value.replace("-","")
  const options = {
     method: 'GET',
     mode: 'cors',
     cache: 'default'
  }
    fetch(`https://viacep.com.br/ws/${search}/json/`, options)
    .then(response =>{ response.json() 
      .then( data => showData(data))
    })
    .catch(e => console.log('Erro: '+ e,message))
})


function mascaracpf(i){

   var v = i.value;

   if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
      i.value = v.substring(0, v.length-1);
      return;
   }

   i.setAttribute("maxlength", "14");
   if (v.length == 3 || v.length == 7) i.value += ".";
   if (v.length == 11) i.value += "-";

}

function mascaracep(i){

   var v = i.value;

   if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
      i.value = v.substring(0, v.length-1);
      return;
   }

   i.setAttribute("maxlength", "9");
   if (v.length == 5) i.value += "-";

}

function mascara(o, f) {
  setTimeout(function() {
    var v = mascaratelefone(o.value);
    if (v != o.value) {
      o.value = v;
    }
  }, 1);
}

function mascaratelefone(v) {
  var r = v.replace(/\D/g, "");
  r = r.replace(/^0/, "");
  if (r.length > 10) {
    r = r.replace(/^(\d\d)(\d{5})(\d{4}).*/, "($1) $2-$3");
  } else if (r.length > 5) {
    r = r.replace(/^(\d\d)(\d{4})(\d{0,4}).*/, "($1) $2-$3");
  } else if (r.length > 2) {
    r = r.replace(/^(\d\d)(\d{0,5})/, "($1) $2");
  } else {
    r = r.replace(/^(\d*)/, "($1");
  }
  return r;
}
