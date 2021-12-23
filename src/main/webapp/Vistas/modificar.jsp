<%-- 
    Document   : modificar
    Created on : 23 nov. 2021, 14:22:48
    Author     : Usuario
--%>

<%@page import="modelo.AlumnosDAO"%>
<%@page import="modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modifical alumno</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        
        <%
            String id = request.getParameter("id");
            int mid;
            mid = Integer.parseInt(id);            
            Alumnos resultado= null;
            AlumnosDAO alumno = new AlumnosDAO();
            resultado = alumno.mostrarAlumno(mid);
        
        %>
        
        <h1 class="text-center">Modifical alumno</h1>
        <div clas="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosController?accion=actualizar" method='POST'>
                    <div class='mb-3'>
                        <label for="id" class='form-label'></label> 
                        <input type="hidden" name="id" class='form-control' id='id' value="<%= resultado.getId() %>" />
                    </div> 
                    <div class='mb-3'>
                        <label for="nombre" class='form-label'>Nombre</label> 
                        <input type="text" name="nombre" class='form-control' id='nombre' value="<%= resultado.getNombre()%>" />
                    </div> 
                    <div class='mb-3'>
                        <label for="apellido" class='form-label'>Apellido</label> 
                        <input type="text" name="apellido" class='form-control' id='apellido'value="<%= resultado.getApellido()%>" />
                    </div> 
                    <div class='mb-3'>
                        <label for="email" class='form-label'>Email</label> 
                        <input type="text" name="email" class='form-control' id='email'value="<%= resultado.getEmail()%>" />
                    </div> 
                    <div class='mb-3'>
                        <label for="telefono" class='form-label'>Telefono</label> 
                        <input type="text" name="telefono" class='form-control' id='telefono' value="<%= resultado.getTelefono()%>" />
                    </div> 
                    <button class='btn btn-primary' type="submit">Enviar</button>
                </form>
            </div>
        </div>
    </body>
</html>
