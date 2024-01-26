//Rey David Martínez Olivares   3/5
const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const nombre = document.querySelector('.name');   //Faltaba el punto en name para que trajera la clase
const blog = document.querySelector('.blog');
const location = document.querySelector('.location');

async function displayUser(username) {    //Se agregó el async para corregir el problema con el await de línea 9
  nombre.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`);
  console.log(data);
  nombre.textContent = `${data.name}`;  //Cambiamos comillas simples por backtiks
  blog.textContent = `${data.blog}`;
  location.textContent = `${data.location}`;
  return 
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  nombre.textContent = `Algo salió mal: ${err}`  //Se agregó el signo de $
}

displayUser('stolinski').catch(handleError);