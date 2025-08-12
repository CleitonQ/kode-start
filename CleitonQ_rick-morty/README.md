# 🛸 Rick & Morty - Flutter App

## 📌 Desafio

Desenvolvimento de um aplicativo Flutter para fãs da série **Rick & Morty**, consumindo a **Rick and Morty API (REST)**.  
O aplicativo tem como objetivo exibir uma lista de personagens e permitir a navegação para uma tela de detalhes de cada um,
com base em um protótipo de alta fidelidade fornecido pela **Kobe Apps**.

---

## 🧾 Descrição Geral

O objetivo deste projeto é criar um app móvel com Flutter que:

- Exibe uma lista de personagens da série Rick & Morty.
- Permite navegar para uma tela de **detalhes** de cada personagem.
- Mostra informações como:
   - Nome
   - Imagem
   - Status
   - Localização
   - Primeira aparição
   - E mais...

---

## ✅ Funcionalidades Obrigatórias

### 1. Lista de Personagens com Scroll
- Tela inicial com uma lista rolável.
- Cada item exibe o **nome** e a **imagem** do personagem.

### 2. Tela de Detalhes do Personagem
Ao clicar em um personagem, o app exibe:

- Nome
- Imagem
- Espécie
- Gênero
- Status
- Origem
- Última localização conhecida
- Primeira aparição

### 3. Navegação entre Telas
- Navegação fluida entre a lista e a tela de detalhes.

---

## ⚙️ Requisitos Técnicos

- **Tecnologia:** Flutter (Dart)
- **API:** [Rick and Morty API (REST)](https://rickandmortyapi.com/)
- **Responsividade:** Suporte a diversos tamanhos de tela
- **Design:** Baseado em Material Design

### 📚 Bibliotecas Utilizadas

- `http`: Requisições REST
- `google_fonts`: Fonte Lato
- `flutter`: Framework principal

---

## ✨ Funcionalidades Adicionais

- **🔄 Detalhes Dinâmicos:** Carregamento assíncrono via `FutureBuilder`
- **Status do personagem:** A cor varia se o personagem for: Vivo, morte ou desconhecido

---

## 🧱 Arquitetura e Padrões

- **Componentes Reutilizáveis:** `AppBarWidget`, `CharacterCardWidget`, etc.
- **Chamadas Assíncronas:** `FutureBuilder`
- **Responsividade:** `MediaQuery`, `SingleChildScrollView`

---

## 📁 Estrutura do Projeto

```bash
lib/
├── components/                     # Widgets reutilizáveis
│   ├── app_bar_widget.dart         # AppBar customizado com troca de tema
│   ├── character_card_widget.dart  # Card de personagem
│   └── ...                       
│
├── data/                         
│   ├── repository.dart             # Funções para buscar dados da API
│   └── ...                       
│
├── models/                       
│   ├── character_page.dart         # Tela de detalhes do personagem
│   ├── detailed_character.dart     # Modelo de dados do personagem
│   └── ...                       
│
├── pages/                        
│   ├── home_page.dart              # Tela inicial
│   └── ...                       
│
├── theme/                        
│   ├── app_theme.dart              # Fontes e fontes
│   └── ...                       
│
├── main.dart                       # Arquivo principal
└── pubspec.yaml                    # Dependências do projeto


## ▶️ Como Rodar o Projeto

### 📌 Pré-requisitos

- Flutter instalado na sua máquina
- Editor de código (VS Code, Android Studio, etc.)

### 🧭 Passos

1. **Clone o repositório:**

```bash
git clone https://github.com/CleitonQ/kode-start.git

2. **Acesse o diretório do projeto:**

```bash
cd seu_repositorio

3. **Instale as dependências:**

```bash
flutter pub get

4. **Execute o aplicativo:**

```bash
flutter run

