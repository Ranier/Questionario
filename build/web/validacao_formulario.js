// Função para capturar eventos
function captura_eventos(objeto, evento, funcao) {
    // Testa se o navegador suporta addEventListener
    if (objeto.addEventListener) {
        // Adiciona addEventListener
        objeto.addEventListener(evento, funcao, true);
    }
    // Testa se o navegador suporta attachEvent
    else if (objeto.attachEvent) {
        // Adiciona a palavra on no evento
        var evento = 'on' + evento;
        // Adicionar attachEvent
        objeto.attachEvent(evento, funcao);
    }
}
 
// Função para cancelar os eventos
function cancela_evento(evento) {
    // Testa se o navegador suporta stopPropagation
    if (evento.stopPropagation) {
        // Adiciona stopPropagation
        evento.stopPropagation();
        // Adiciona preventDefault
        evento.preventDefault();
    } else {
        // Configura returnValue como false para o IE
        evento.returnValue = false;
        // Cancela a propagação para o IE
        evento.cancelBubble = true;
    }
}
 
// Função geral para rodar após o load da página
function geral() {
    // Função para capturar o submit do formulário
    captura_eventos(document.getElementById('meu_formulario'), 'submit', envia_formulario);
}
 
// Carrega a função geral após o carregamento da página
captura_eventos(window, 'load', geral);
 
// Função para o submit do formulário
function envia_formulario(evento) {
    // Captura o evento para o IE ou outros navegadores
    var o_evento = evento ? evento : window.event;
 
    alert('Evento de submit enviado!');
 
    // Cancela o envio do formulário
    cancela_evento(o_evento);
}


