<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Alta odontologos</h1>
<p>Ehto sigue siendo una prueba</p>

<form class="user">
    
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="DNI"
                   placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido"
                   placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono"
                   placeholder="Telefono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleLastName"
                   placeholder="Last Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion"
                   placeholder="Dirección ">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechanac"
                   placeholder=" FechaNac">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechanac"
                   placeholder=" FechaNac">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad"
                   placeholder=" Especialidad">
        </div>
        
        <!-- acá van todo lo que respecta a horarios y usuarios -->
    </div>
    
    <a href="" class="btn btn-primary btn-user btn-block">
        Crear odontologo
    </a>

</form>

<%@include file="components/bodyfinal.jsp" %>