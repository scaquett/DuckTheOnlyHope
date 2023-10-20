# DuckTheOnlyHope
API para catalogar zumbis e ajudar patos a combatê-los... Ou algo assim.

## Documentação da API

#### Cadastra hospedeiro

```https
  POST /host/add
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `age` | `number` | **Obrigatório**. Idade do hospedeiro |
| `sex` | `string` | **Obrigatório**. Sexo do hospedeiro |
| `weight` | `number` | **Obrigatório**. Peso do hospedeiro |
| `height` | `number` | **Obrigatório**. Altura do hospedeiro |
| `bloodType` | `string` | **Obrigatório**. Tipo sanguíneo do hospedeiro |
| `musicalGenre` | `string` | **Obrigatório**. Gênero musical favorito do hospedeiro |
| `sport` | `string` | **Obrigatório**. Esporte praticado pelo hospedeiro |
| `game` | `string` | **Obrigatório**. Game jogado pelo hospedeiro |

#### Retorna todos os zumbis

```https
  GET /zombie/getAll
```
#### Retorna uma estratégia de combate para ser usada contra o zumbi

```https
  GET /zombie/getCombatStrategy/{zombieId}
```
| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `zombieId` | `number` | **Obrigatório**. ID do zumbi previamente cadastrado |
