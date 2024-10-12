// Url del api
const apiUrl = "http://vps-4437505-x.dattaweb.com:8080/personas/traer";

//Obtener el boton y el contenedor

const btnCargar = document.querySelector('#btn-cargar');
const apiInfoContainer = document.querySelector('#api_container')


// Escuchar cuando se da click 

btnCargar.addEventListener('click',() => {

    //Llamar al api
    fetch(apiUrl, { 
        method: 'GET',
        mode: 'no-cors'
    })
        //convertir la respuesta a json
        .then(response => response.json())
        .then(data => {
            //Obtener nombre del lal
            const apiInfo = data[0].nombre;

            // agregar la info como background al container
            apiInfoContainer.style.backgroundImage = `url('${apiInfo})`;
        } )
})


// Script de llamado ala Api
fetch(apiUrl, { 
    method: 'GET',
    mode: 'no-cors'
})
.then(response => {
    if (!response.ok) {
        throw new Error('Network response was not ok');
    }
    // Since the response is opaque, we can't parse it as JSON
    return response;
})
.then(data => console.log('Request succeeded:', data))
.catch(error => {
    console.error('Error:', error);
});