//Rey David Martínez Olivares 4/5

//Tenemos una lista desordenada de productos
const productos = [
  {nombre: "Zapato negro", tipo: "zapato", color: "negro", img: "./src/img/taco-negro.jpg"},
  {nombre: "Zapato azul", tipo: "zapato", color: "azul", img: "./src/img/taco-azul.jpg"},
  {nombre: "Bota negra", tipo: "bota", color: "negro", img: "./src/img/bota-negra.jpg"},
  {nombre: "Bota azul", tipo: "bota", color: "azul", img: "./src/img/bota-azul.jpg"},
  {nombre: "Zapato rojo", tipo: "zapato", color: "rojo", img: "./src/img/zapato-rojo.jpg"}
];

// Obtén la referencia al ul de productos por su id
const ul = document.getElementById("lista-de-productos");

const $i = document.querySelector('.input');

function displayProductos(productos) {
  for (let i = 0; i < productos.length; i++) {
    var li = document.createElement("li"); // Cambiado a li en lugar de div
    li.classList.add("producto");

    var ti = document.createElement("p");
    ti.classList.add("titulo");
    ti.textContent = productos[i].nombre;

    var imagen = document.createElement("img");
    imagen.setAttribute('src', productos[i].img);

    li.appendChild(ti);
    li.appendChild(imagen);

    ul.appendChild(li);   // Agregamos ul con el método appendChild y cambiamos el parámetro por li
  }
}

displayProductos(productos);

const botonDeFiltro = document.querySelector("button");

botonDeFiltro.onclick = function() {
  while (ul.firstChild) {
    ul.removeChild(ul.firstChild);
  }

  const texto = $i.value.toLowerCase(); // Convertido a minúsculas para hacer la comparación insensible a mayúsculas
  const productosFiltrados = filtrado(productos, texto);

  displayProductos(productosFiltrados);
};

const filtrado = (productos = [], texto) => {
  return productos.filter(item => item.tipo.includes(texto) || item.color.includes(texto));
};
