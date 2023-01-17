# Sistema de Livraria

### Sistema produzido em Java para entrega do desafio do Programa de Desenvolvimento Profissional
---
## ✒️ Autor

* 🤖 José Alan Vieira Sales
 - ✉ E-mail: salesalan854@gmail.com
 - 📞 Whatsapp: (88) 988695336

## 🛠️ Construído com

* P.O.O

## ⭐ Uma breve descrição
* O sistema possui uma entidade: Livro
* Com os seguintes atributos:
- 📘 Livro -> nome (String); autor (String); preco (Double); tipo_promocao (char); dataPromocaoInicio (String); dataPromocaoFim (String)
                 precoComDesconto (Double); porcentagem (int);
                 
- Há um menu principal numerado com 1 e 2, onde há as seguintes opções: (1) Criar um novo cadastro e (2) Sair

- Ao escolher o tipo da promoção, a data inicial e final da promoção, preço com desconto e porcentagem (de desconto) são setados automaticamente

- Ao final, o sistema gera um relatório com os seguintes campos preenchidos:
Nome, Autor(a), Preço Original, Preço promocional, Porcentagem aplicada, Data de início da promoção, Data fim da promoção              

## ⚙️ Operações
* Inserir um novo livro e sair

###### Ao executar o sistema, surgirá um menu com as duas operações acima. Ao selecionar 1, serão solicitados: nome do livro, autor(a), preço e tipo da promoção.
###### Após isso, surgirá um relatório com o nome da obra, autor(a), preço original, preço promocional, porcentagem aplicada (de acordo com o tipo da promoção), data de inico e fim da promoção.
---
### 👀 Observações:
Não é possível selecionar uma opção diferente da que se encontra no menu, o sistema identificará o erro e irá solicitar uma nova resposta até que uma compatível seja inserida

#### As seguintes tabelas abaixo podem ser usadas como casos de teste (disponibilizadas pelos organizadores do desafio)
- Livros

| Nome | Autor(a) | Preço | Tipo da promoção |
| ------------- | ------------- | ------------- | ------------- |
| Malala: A menina que queria ir para a escola  | Adriana Carranca  | 21,90 | B |
| A revolução dos bichos: Um conto de fadas | George Orwell | 8,50 | A |
| Amoras | Emicida | 19,90 | B |
| Perigoso! | Tim Warnes | 16,90 | A |
| O morro dos ventos uivantes | Emily Bontë | 12,90 | A |
| Maus | Art Spiegelman | 34,90 | C |
| Auto da compadecida | Ariano Suassuna | 31,30 | A |
| Extraordinário | R.J. Palacio | 35,90 | C |

- Detalhes das promoções

| Tipo da promoção | Inicio da promoção | Fim da promoção | Desconto (%) |
| ------------- | ------------- | ------------- | ------------- |
| A | 10/01/2023 | 15/01/2023 | 5 |
| B | 10/01/2023 | 20/01/2023 | 10 |
| C | 11/01/2023 | 30/01/2023 | 15 |
