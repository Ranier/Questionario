<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Questionário Reação</title>
        <script src="validacao_formulario.js"></script>
    </head>
    <body>
        <h1>QUESTIONÁRIO DE REAÇÃO</h1>
        <form name="Formulario1" action="ServletPrincipal" method="POST">
            <label> Nome do Curso: </label><input type="text" name="NomeCurso" value="" size="100" />
            <hr>
            <div class="comboBoxExpectativa">  
                <label>  
                    Como você avaliaria sua expectativa em relação ao curso?  
                    <select name="avaliaEpectativa" size="0">  
                        <option selected="selecaoExpectativa">Escolha</option>  
                        <option  value="0">0</option>  
                        <option  value="1">1</option>  
                        <option  value="2">2</option>  
                        <option  value="3">3</option>  
                        <option  value="4">4</option>  
                        <option  value="5">5</option>  
                        <option  value="6">6</option>  
                        <option  value="7">7</option>  
                        <option  value="8">8</option>  
                        <option  value="9">9</option>  
                        <option  value="10">10</option>  
                    </select>  
                </label>  
            </div> 
            <hr>
            <div class="comboBoxRealizacao">  
                <label> 
                    Como você avaliaria a realização do curso?
                    <select name="avaliaRealizacao" size="0">
                        <option selected="selecaoRealizacao">Escolha</option>
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                    </select>
                </label>  
            </div> 
            <hr>
            <div class="comboBoxRealizacao">  
                <label> 
                    Que nota você daria para o instrutor deste treinamento?
                    <select name="avaliaRealizacao" size="0">
                        <option selected="selecaoRealizacao">Escolha</option>
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                    </select>
                </label>  
            </div> 
            <hr>
            <label>
                O conteúdo foi adequado e é aplicável no seu dia-a-dia?
                <input type="radio" name="radios" value="sim" checked>
                SIM
                <input type="radio" name="radios" value="nao">
                NÃO
            </label>
            <hr>
            <label>
                <input type="checkbox" name="id" value="opcao1">Posso Aplicar o que aprendi imediatamente no meu dia-a-dia.<BR>
                <input type="checkbox" name="id" value="opcao2">O instrutor dominava o conteudo apresentado.<BR>
                <input type="checkbox" name="id" value="opcao3">Todos ficaram atentos ao curso durante toda a sua duração.<BR>
                <input type="checkbox" name="id" value="opcao4">Poucas pessoas faltaram ou se ausentaram durante o treinamento.<BR>
                <input type="checkbox" name="id" value="opcao5">Gostaria que houvesse outros treinamentos como este<BR> 
                <input type="checkbox" name="id" value="opcao6">Precisamos de mais aprofundamento no tema apresentado<BR> 
            </label>
            <hr>
            <label>
                Comentários:
                <textarea id="comentario" name="comentario" ></textarea>
            </label>
            <input type="submit" value="Enviar" name="BotaoEnviar" />

            <h2>

                <%
                    if (request.getAttribute("NomeCompleto") != null) {
                        out.print(request.getAttribute("NomeCompleto"));
                    }
                %>

            </h2>

        </form>
    </body>
</html>
