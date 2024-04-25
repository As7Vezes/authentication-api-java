# Documentação API back-end.

A API de Autenticação foi desenvolvida para gerenciar a autenticação e autorização de usuários em um sistema. Ela fornece endpoints para registro de novos usuários, login, recuperação de senha e acesso seguro aos recursos protegidos da aplicação.

## Tecnologias Utilizadas na API de Autenticação:

A API de Autenticação utiliza o Spring Boot (3.2.5) com diversas tecnologias como Spring Boot Starter Data JPA, Spring Boot Starter Security e Spring Boot Starter Web para criar um sistema de autenticação seguro. Também faz uso do docker para desenvolvimento e do PostgreSQL para produção, além de ferramentas como Lombok para redução de código boilerplate e Java JWT para manipulação de tokens JWT. Essas tecnologias combinadas garantem um desenvolvimento eficiente e seguro da API de autenticação.

## Componentes Principais:

1. **UserController:** Responsável por receber e processar requisições relacionadas aos usuários, como registro, login e recuperação de senha.
2. **DTO (Data Transfer Object):**
    - **error:** Contém DTOs para lidar com erros na API.
    - **CreateUserDto:** DTO para receber dados de registro de novos usuários.
    - **LoginUserDto:** DTO para receber dados de login de usuários.
    - **RecoveryTokenDto:** DTO para receber dados de token de recuperação de senha.
    - **RecoveryUserDto:** DTO para receber dados de recuperação de senha.
3. **Entity:** Contém as entidades do banco de dados.
    - **Role:** Representa o papel/priviégio do usuário no sistema.
    - **User:** Representa um usuário do sistema.
4. **Enums:**
    - **RoleName:** Enumeração dos tipos de papéis/priviégios dos usuários.
5. **Exception Handler:**
    - **NotFoundException:** Classe para lidar com exceções de recurso não encontrado.
6. **Repository:** Camada de acesso ao banco de dados.
    - **UserRepository:** Interface para operações relacionadas aos usuários no banco de dados.
7. **Security:**
    - **authentication:** Componentes relacionados à autenticação e autorização.
        - **JwtTokenService:** Serviço para manipulação de tokens JWT.
        - **UserAuthenticationFilter:** Filtro de autenticação de usuários.
        - **SecurityConfiguration:** Configuração de segurança da aplicação.
    - **userdetails:** Implementações do Spring Security para detalhes do usuário.
        - **UserDetailsImpl:** Implementação personalizada de UserDetails.
        - **UserDetailsService:** Serviço para carregar detalhes do usuário.
8. **UserService:** Serviço para manipulação de usuários, incluindo registro, login e recuperação de senha.
9. **AuthenticationApiApplication:** Classe principal da aplicação Spring Boot.

## Funcionalidades:

1. **Registro de Usuário:**
    - Endpoint: **`POST /users`**
    - Payload: CreateUserDto
    - Descrição: Permite que um novo usuário seja registrado no sistema.
2. **Login de Usuário:**
    - Endpoint: **`POST /users/login`**
    - Payload: LoginUserDto
    - Descrição: Autentica um usuário e gera um token JWT para acesso seguro aos recursos protegidos.

## Instruções de uso:

1. Clone o repositório e importe o projeto em sua IDE preferida.
2. Configure o banco de dados de acordo com as configurações em **`application.properties`**.
3. Execute a aplicação Spring Boot.
4. Utilize os endpoints da API conforme descrito acima para interagir com o sistema de autenticação.

Esta documentação oferece uma visão geral dos componentes e funcionalidades da API de Autenticação. É importante consultar a implementação detalhada de cada componente e as especificações dos endpoints para um entendimento completo do sistema.
