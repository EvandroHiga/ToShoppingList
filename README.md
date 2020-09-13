# RecipeToShoppingList :: Web App *Spring MVC*
![#ffff1a](https://via.placeholder.com/15/ffff1a/000000?text=+) *Em andamento...*

### Sobre
> Aplicação web que, inicialmente, irá armazenar e gerenciar receitas e a partir destas, criar listas de compras customizáveis. Estas listas e receitas poderão ser compartilhadas entre diferentes usuários.

### O que foi utilizado
> ***Java 8*** e ***eclipse IDE***.

> ***Spring MVC 4*** no *front controller* e *injeção de dependência*.

> ***MySQL 8*** e, na camada de persistência, ***JDBC***. O ***Hibernate JPA*** será implementado em uma branch separada futuramente.

> ***Apache Maven*** para gerenciar as dependências do projeto.

> ***Tomcat 8.5***.

### Como usar
> `git clone --branch my_branch_01 https://github.com/EvandroHiga/ToShoppingList.git`

> Importe o projeto Maven para a sua IDE. No caso do eclipse, vá em *File > Import... > Existing Maven Project*

> Insira o projeto no servlet container e inicie-o. 

> No seu browser de preferência, chame a URL `http://localhost:8080/ToShoppingList/<request_mapping>`. Substitua `<request_mapping>` por um request mapping disponível em um dos controllers. O teste será realizado desta forma somente enquanto o *Interceptor* não estiver implementado.
