<%-- 
    Document   : index
    Created on : 14 dic. 2021, 14:28:26
    Author     : elias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    </head>
    <body>
        <h1 class="text-center">Login</h1>
        <div clas="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosController?accion=ingresar" method='POST'>
                    <div class='mb-3'>
                        <label for="email" class='form-label'>Email</label> 
                        <input type="text" name="email" class='form-control' id='email'/>
                    </div> 
                    <div class='mb-3'>
                        <label for="password" class='form-label'>password</label> 
                        <input type="text" name="password" class='form-control' id='password'/>
                    </div> 
                    <button class='btn btn-primary' type="submit">Ingresar</button>
                </form>
            </div>
        </div>
                    
    </body>
</html>
