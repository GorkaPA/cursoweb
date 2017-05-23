'use strict'

var patronNombre = /^([A-Z]{1}[0-9a-zñáéíóú._%+-]{1,19})+$/;
var patronDescripcion = /^([0-9A-Za-zñáéíóú-\s]{10,200})+$/;
var patronPrecio = /[0-9]{1,3}(\,[0-9]{2})/;
var patronStock = /^([0-9]{1,4})+$/;
var patronFecha = /^\d{2}\/\d{2}\/\d{4}$/;
var d = new Date();
var strDate = d.getDate() + "/" + (d.getMonth() + 1) + "/" + d.getFullYear();

$(function () {
    $('.borrar').on('click', function () {
        confirm("¿Estas seguro de borrar esa línea?");
    });
    $('#aniadir').click(aniadir);
    $('.modificar').click(modificar);
    $('#cancelar').click(cancelar);
    $('#formularioAniadir').on('submit', validar);
});

function aniadir() {
    if (!$('#formularioAniadir').is(":visible")) {
        $("#formularioAniadir").css("display", "block");
        $('<label for="id">ID: </label><label for = "id_numero" >1 </label>').insertBefore($('label[for=nombre]'));
        $('<legend class="tituloFormulario">Producto a añadir</legend>').insertBefore($('label[for=id]'));
        $('label[for=nombre]').css("display", "block");
    } else {
        $('.tituloFormulario').remove();
        $('<legend class="tituloFormulario">Producto a añadir</legend>').insertBefore($('label[for=id]'));
        $('label[for=error]').remove();
        $('input').css("border", "");
        $('textarea').css("border", "");
        $('select').css("border", "");
    }
    $('#formularioAniadir')[0].reset();
    $('#fecha').val(strDate);
}

function modificar() {
    if (!$('#formularioAniadir').is(":visible")) {
        $("#formularioAniadir").css("display", "block");
        $('<label for="id">ID: </label><label for = "id_numero" >1 </label>').insertBefore($('label[for=nombre]'));
        $('<legend class="tituloFormulario">Producto a modificar</legend>').insertBefore($('label[for=id]'));
        $('label[for=nombre]').css("display", "block");
    } else {
        $('.tituloFormulario').remove();
        $('<legend class="tituloFormulario">Producto a modificar</legend>').insertBefore($('label[for=id]'));
        $('label[for=error]').remove();
        $('input').css("border", "");
        $('textarea').css("border", "");
        $('select').css("border", "");
    }
    //Esto hay que quitar y sustituir por la integración de la información de la línea seleccionada
    $('#formularioAniadir')[0].reset();
    /*if (!$('#formularioAniadir').is(":visible")) {
        $("#formularioAniadir").css("display", "block");
        $('<legend class="tituloFormulario">Producto a modificar</legend>').insertBefore($('label[for=id]'));
    } else {
        $("#formularioAniadir").css("display", "none");
        $('.tituloFormulario').remove();
    }*/

}

function cancelar() {
    $("#formularioAniadir").css("display", "none");
    $('.tituloFormulario').remove();
    $('label[for=id]').remove();
    $('label[for=id_numero]').remove();
    $('label[for=error]').remove();
    $('input').css("border", "");
    $('textarea').css("border", "");
    $('select').css("border", "");
    $('#formularioAniadir')[0].reset();
}

var error = $('<label for="error"></label>');

function mensaje(elemento, mensaje) {
    $(elemento).css("border", "3px solid red");
    $(error).text(mensaje).insertAfter($(elemento));
    $('label[for=error]').css({
        'color': 'red',
        'display': 'block'
    });
}

function validar() {
    if (!$('#nombre').val().match(patronNombre)) {
        mensaje('#nombre','Introduce mínimo dos caracteres empezando por mayusculas');
        $('#nombre').focus();
        return false;
    } else {
        $('label[for=error]').remove();
        $('#nombre').css("border", "");
    }
    if (!$('#descripcion').val().match(patronDescripcion)) {
        mensaje('#descripcion','Introduce una descripción de 10 a 200 caracteres');
        $('#descripcion').focus();
        return false;
    } else {
        $('label[for=error]').remove();
        $('#descripcion').css("border", "");
    }
    if (!$('#precio').val().match(patronPrecio)) {
        mensaje('#precio','Introduce una cantidad con dos decimales separados por coma');
        $("#precio").focus();
        return false;
    } else {
        $('label[for=error]').remove();
        $('#precio').css("border", "");
    }
    if (!$('#stock').val().match(patronStock)) {
        mensaje('#stock','Introduce una cantidad positiva');
        $("#stock").focus();
        return false;
    } else {
        $('label[for=error]').remove();
        $('#stock').css("border", "");
    }
    if ($('#categoria').val() == 0) {
        mensaje('#categoria','Introduce una cantegoría');
        $("#categoria").focus();
        return false;
    } else {
        $('label[for=error]').remove();
        $('#categoria').css("border", "");
    }
    //rellenarCeros();
}

/*
window.onload = function () {
    form = document.forms[0];
    nombre = form.nombre;
    apellidos = form.apellidos;
    dni = form.txtDni;
    sexo = form.sexo;
    dia = form.dia;
    mes = form.mes;
    anio = form.anio;
    var btnEnviar = form.boton_enviar;
    btnEnviar.onclick = validar();
}

function validar() {
    form.onsubmit = function () {
        if (!evaluarNombre()) {
            nombre.focus();
            return false;
        }
        if (!evaluarApellidos()) {
            apellidos.focus();
            return false;
        }
        if (!evaluarDni()) {
            dni.focus();
            return false;
        }
        if (!evaluarSexo()) {
            sexo.focus();
            return false;
        }
        if (!evaluarDia()) {
            dia.focus();
            return false;
        }
        if (!evaluarMes()) {
            mes.focus();
            return false;
        }
        if (!evaluarAnio()) {
            anio.focus();
            return false;
        }
        if (!evaluarIdiomas()) {
            form.idioma1.focus();
            return false;
        }
    }
}

function evaluarNombre() {
    var nombreValor = nombre.value;
    validarPatron = patron.test(nombreValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        texto = "¡¡¡NO has introducido correctamente el nombre!!!\nEjemplo: Luis Angel";
        error(nombre, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarApellidos() {
    var apellidosValor = apellidos.value;
    validarPatron = patron.test(apellidosValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        texto = "¡¡¡NO has introducido correctamente los apellidos!!!\nEjemplo: Marquez Robles";
        error(apellidos, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarDni() {
    var dniValor = dni.value;
    if (!validarDni(dniValor)) {
        texto = "¡¡¡NO has introducido correctamente el dni!!!\nEjemplo: 12345678Z";
        error(dni, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarSexo() {
    if (sexo.value == 0) {
        texto = "¡¡¡NO has seleccionado sexo!!!";
        error(sexo, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarDia() {
    if (dia.value == 0) {
        texto = "¡¡¡NO has seleccionado un día!!!";
        error(dia, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarMes() {
    if (mes.value == 0) {
        texto = "¡¡¡NO has seleccionado un mes!!!";
        error(mes, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarAnio() {
    if (anio.value == 0) {
        texto = "¡¡¡NO has seleccionado un año!!!";
        error(anio, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarIdiomas() {
    if (form.idioma1.checked || form.idioma2.checked || form.idioma3.checked) {
        return true;
    } else {
        texto = "¡¡¡NO has seleccionado ningún idioma!!!";
        error(form.idioma1, texto);
        return false;
    }
}
*/

/*


function formulario() {
    var altoDisplay = window.innerHeight;
    var anchoDisplay = window.innerWidth;

    var divFondo = $("<div></div>").text("EE");

    divFondo.id = "popupfondo";

    divFondo.style.backgroundColor = "rgba(50, 50, 50, 0.8)";
    divFondo.style.position = "fixed";
    divFondo.style.top = 0;
    divFondo.style.left = 0;
    divFondo.style.height = altoDisplay + "px";
    divFondo.style.width = anchoDisplay + "px";
    divFondo.style.zIndex = 10000;

    document.body.appendChild(divFondo);

    var x, y, alto, ancho;

    alto = altoDisplay / 2;
    ancho = anchoDisplay / 2;

    x = ancho / 2;
    y = alto / 2;

    var divMensaje = document.createElement("div");

    divMensaje.id = "popcuadromensaje";

    divMensaje.style.backgroundColor = "white";
    divMensaje.style.position = "fixed";
    divMensaje.style.top = y + "px";
    divMensaje.style.left = x + "px";
    divMensaje.style.height = alto + "px";
    divMensaje.style.width = ancho + "px";
    divMensaje.style.zIndex = 10001;
    divMensaje.style.textAlign = "center";
    divMensaje.style.fontSize = "2em";

    divFondo.appendChild(divMensaje);

    divMensaje.innerHTML = "<h1>ERROR</h1><p>AAAAA</p>";

    var boton = document.createElement("button");

    boton.innerHTML = "ACEPTAR";
    boton.onclick = function () {
        divFondo.parentNode.removeChild(divFondo);
        elemento.focus();
    };

    divMensaje.appendChild(boton);
}

*/

/*$($(function() {
    $('#borrar').on('click', function(){
        $('input[type=text]:nth-child(2)').val('BORRADO');
    });
    
    $('#conmutar').click(function() {
        $('input[id!=conmutar]').toggle(1000); //.fadeOut(1000).fadeIn(1000); //.fadeToggle(1000); //.toggle(1000);//.hide(); //.show()
        $('<span class="errorTexto">Error</span>').insertAfter($('#nombre'));
        
        $('input[type=text]').toggleClass('errorCuadro'); //addClass('asd')
    });
    
    $('form').on('submit', function() {
        alert($('#nombre').val());
        
        $('#opciones option').each(function() {
            //alert(this.value);
            alert($(this).val());
        });

    });
    
});)*/
