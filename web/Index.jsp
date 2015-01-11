<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Questionário Reação</title>
        
    </head>
    <body>
        
        <h2>
         <script>
      document.write("Desenvolvimento Páginas Web JAVA");    
          </script>
        </h2>
        <h1>FORMULÁRIO DE TESTE</h1>
        <form name="Formulario1" action="ServletPrincipal" method="POST">
            <label> Nome: </label><input type="text" name="Nome" value="" size="30" />
            <br>
            <label> Sobrenome: </label><input type="text" name="Sobrenome" value="" size="30" />
            <br>
            <input type="submit" value="Enviar" name="BotaoEnviar" />
            <h2>
               
                
                <p id="soma"></p>
              <script>
                function myFunction(a, b) {
                return a + b;
                }
                document.getElementById("soma").innerHTML = myFunction(4, 8);
              </script>
              
                <%
                    if (request.getAttribute("NomeCompleto") != null)
                    out.print(request.getAttribute("NomeCompleto"));
                %>
            
            </h2>
    
        </form>
    </body>
</html>
