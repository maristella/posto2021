window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AbastecimentoCarro = window.blockly.js.blockly.AbastecimentoCarro || {};

/**
 * AbastecimentoCarro
 */
window.blockly.js.blockly.AbastecimentoCarro.confirmar = async function() {

  this.cronapi.screen.changeValueOfField("Abastecimento.active.carro", this.cronapi.screen.getValueOfField("params.carroId"));
  this.cronapi.screen.post("Abastecimento");
}
