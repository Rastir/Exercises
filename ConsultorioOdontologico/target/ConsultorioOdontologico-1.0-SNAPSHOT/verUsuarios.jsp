<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Ver usuarios </h1>


<!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <p class="mb-4">A continuación podrá ver la lista completa de usuarios </p>
                    
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre de Usuario</th>
                                            <th>Rol</th>
                                            <th style ="width: 210px"> acción</th>
                                            
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre de Usuario</th>
                                            <th>Rol</th>
                                            <th style ="width: 210px"> acción</th>
                                        </tr>
                                    </tfoot>
                                    
                                    <%
                                        List<Usuario> listaUsuarios = (List)request.getSession().getAttribute("listaUsuarios");
                                    %>
                                    <tbody>
                                        <% for(Usuario usu:listaUsuarios){
                                        
                                        %>
                                        <tr>
                                            <td><%= usu.getId_udusrio()%></td>
                                            <td><%= usu.getNombreUsuario()%></td>
                                            <td><%= usu.getRol()%></td>
                                            
                                            <td style="display: flex;width:230px;">
                                                <form name="eliminar" action="SvElimUsuarios" method="POST"><!-<!-- esto es para mandar el codigo al servlet -->
                                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red;margin-right: 5px;">
                                                        <i class ="fas fa-trash-alt"></i>Eliminar
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=usu.getId_udusrio()%>"><!-- esto es para obtener el id a borrar para enviar al servlet -->
                                                </form>
                                                <form name="editar" action="SvEditUsuarios" method="GET"><!-<!-- esto es para mandar el codigo al servlet -->
                                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: lightslategray;margin-right: 5px;">
                                                        <i class ="fas fa-pencil-alt"></i>Editar
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=usu.getId_udusrio()%>"><!-- esto es para obtener el id a editar para enviar al servlet -->
                                                </form>
                                                </td>
                                        </tr>
                                        <% }%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

<%@include file="components/bodyfinal.jsp" %>