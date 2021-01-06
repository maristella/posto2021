window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Login = window.blockly.js.blockly.Login || {};

/**
 * Login
 */
window.blockly.js.blockly.Login.abrirCadastro = async function() {

  this.cronapi.screen.showIonicModal("modal94676");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Login.fecharCadastro = async function() {

  this.cronapi.screen.hideIonicModal("modal94676");
}
