# language: pt
Funcionalidade: Aprender Cucumber
	Como um aluno
	Eu quero aprender a usar cucumber
	Para que eu possa automatizar critérios de aceitação

Cenario: Deve executar uma especificação
	Dado que criei o arquivo corretamente
	Quando executá-lo
	Então a especificação deve finalizar com sucesso
	
Cenario: Deve incremnetar um contador
	Dado que o valor do contador é 15
	Quando quando eu incrementar em 3
	Então o valor do contador é 18