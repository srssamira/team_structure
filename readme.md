Desenvolvimento de uma aplicação de gerenciamento de times para um campeonato de futebol. Cada time tem uma lista de jogadores, e um time pode ter no máximo 5 jogadores. As operações de CRUD devem seguir a regra de que o time só pode ser criado ou atualizado se não ultrapassar o limite de 5 jogadores.

### 1. Configurações Iniciais

Crie um projeto Spring Boot com as seguintes dependências:
Spring Web
Spring Data JPA
PostgreSQL Driver
Spring Validation
Lombok (opcional, para reduzir código boilerplate)

### 2. Contrato da API

```
POST /api/teams
- Cria um novo time. 
- json:
{"name": "Team A", "players": ["Player 1", "Player 2"]}
201 CREATED em caso de sucesso.
400 BAD REQUEST se a validação falhar (exemplo: mais de 5 jogadores).
```
```
GET /api/teams/{id}
Obtém um time específico pelo id.
json: {
"id": 1,
"name": "Team A",
"players": ["Player 1", "Player 2"]
}
200 OK em caso de sucesso.
404 NOT FOUND se o time não existir.
```
```
PUT /api/teams/{id}
Atualiza um time existente.
json: {
"name": "Updated Team",
"players": ["Player 1", "Player 2", "Player 3"]
}
200 OK em caso de sucesso.
404 NOT FOUND se o time não existir.
400 BAD REQUEST se a validação falhar.
```
```
DELETE /api/teams/{id}
Remove um time específico pelo id.
204 NO CONTENT em caso de sucesso.
404 NOT FOUND se o time não existir.
```
### 3. Regras de Negócio
   Um time pode ter no máximo 5 jogadores.
   O nome do time e o nome dos jogadores não podem ser vazios.