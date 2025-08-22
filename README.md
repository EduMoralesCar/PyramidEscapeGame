<img width="570" height="356" alt="image" src="https://github.com/user-attachments/assets/26f949ba-5e66-4b94-89fb-d30d621bae95" />## 📖 Descripción del Proyecto

**Escape Room: Pirámide** es una aventura gráfica creada en Java utilizando Swing. La historia te sitúa como un investigador atrapado en una pirámide antigua. Con atmósfera envolvente, símbolos enigmáticos y acertijos inteligentes, tu única salida será resolver los desafíos planteados por los antiguos guardianes.

### 🎯 Características Principales

- **🧵 Escritura Animada**: Introducción envolvente con animación de texto estilo narrativo
- **📜 Historia Temática**: Ambientación inspirada en la cultura egipcia con tono misterioso
- **🧩 Acertijos Graduales**: Progresión de niveles mediante resolución lógica
- **🎨 Interfaz con Fondo Personalizado**: Panel visual con imagen que recrea la atmósfera antigua
- **🖼 Créditos del Juego**: Reconocimiento visual a los desarrolladores del proyect

---

## 🚀 Instalación y Configuración

### Prerrequisitos

- **Java JDK 17** 
- **NetBeans IDE** (recomendado) o cualquier IDE compatible con Java

### Pasos de Ejecución

1. **Clonar el repositorio**

   ```bash
   git clone https:https://github.com/EduMoralesCar/PyramidEscapeGame.git
     cd PyramidEscapeGame/
   ```

2. **Ejecutar el proyecto**
   ```bash
   # Desde NetBeans: Clic derecho en el proyecto > Run
   ```

---
## 🎮 Cómo Jugar

- **Lee la historia inicial con atención** (¡contiene pistas ocultas!)
- **Haz clic en “Comenzar Aventura”** para iniciar el reto
- **Resuelve los acertijos en cada nivel** para avanzar por la pirámide
Cada decisión cuenta. Las respuestas correctas son llaves… los errores, pasos hacia la perdición.

### Demostración:
> #### Paso 1:
<img width="675" height="459" alt="image" src="https://github.com/user-attachments/assets/14100fb2-3fcb-4164-be74-63ef956ccc1a" />

> #### Paso 2:
<img width="676" height="551" alt="image" src="https://github.com/user-attachments/assets/7558cdbf-5df4-40e8-8a1f-8a3c889be47a" />

> #### Paso 3:
<img width="577" height="358" alt="image" src="https://github.com/user-attachments/assets/da22d4ae-ce39-48af-a99b-fbda214347a5" />

> #### Paso 4:
<img width="577" height="351" alt="image" src="https://github.com/user-attachments/assets/7cd2cc68-1213-48de-80bc-144bf2b693f9" />

> #### Paso 5:
<img width="575" height="356" alt="image" src="https://github.com/user-attachments/assets/f8012f8b-75ad-4dab-bee3-58ec3a135811" />

> #### Paso 6:
<img width="577" height="359" alt="image" src="https://github.com/user-attachments/assets/eaf9f0c1-6c7c-4beb-aa1b-ab893648f40d" />

> #### Paso 7:
<img width="575" height="356" alt="image" src="https://github.com/user-attachments/assets/db65201a-fc2c-44e8-a4b3-661ff2c4bbce" />

> #### Paso 8:
<img width="577" height="355" alt="image" src="https://github.com/user-attachments/assets/5c532e57-ac7c-4d4b-91ed-67ff86b82e6c" />

> #### Paso 9:
<img width="575" height="356" alt="image" src="https://github.com/user-attachments/assets/8386c979-45da-4286-b7bd-24b8cad24163" />

> #### Paso 10:
<img width="570" height="356" alt="image" src="https://github.com/user-attachments/assets/72f9269d-84b4-4468-a309-ac6d8254c8c3" />

> #### Paso 11:
<img width="575" height="351" alt="image" src="https://github.com/user-attachments/assets/6a4a7d35-256d-4ee9-8b9c-e0061a8e7737" />

> #### Paso 12:
<img width="677" height="458" alt="image" src="https://github.com/user-attachments/assets/ed454526-499a-4ebc-b60f-864ddd87440b" />

> #### Paso 13:

> #### Paso 14:
> #### Paso 15:
> 
---


## 🏗️ Arquitectura del Proyecto

### 📦 Estructura General
```
PiramideEscapeRoom/
├── src/
│   ├── 📁 escapeRoomPiramide/     # Clases de entrada y menú
│   │   ├── 📄 Main.java
│   │   └── 📄 MenuInicioFrame.java
│
│   ├── 📁 historia/               # Narrativa y créditos visuales
│   │   ├── 📄 HistoriaFrame.java
│   │   └── 📄 CreditosFrame.java
│
│   ├── 📁 logica/                 # Lógica interna del juego
│   │   ├── 📄 GestorPreguntas.java
│   │   ├── 📄 Personaje.java
│   │   └── 📄 Pregunta.java
│
│   ├── 📁 niveles/                # Escenarios de juego por nivel
│   │   ├── 📄 Nivel1Frame.java
│   │   ├── 📄 Nivel2Frame.java
│   │   ├── 📄 Nivel3Frame.java
│   │   ├── 📄 Nivel1InteractivoPanel.java
│   │   ├── 📄 Nivel2InteractivoPanel.java
│   │   ├── 📄 Nivel3InteractivoPanel.java
│   │   └── 📄 FinJuegoFrame.java
│
│   ├── 📁 recursos/
│   │   ├── 📁 imagenes/           # Fondos, personajes y elementos gráficos
│   │   │   ├── 🖼️ fondo_historia.png
│   │   │   ├── 🖼️ nivel1_fondo.png
│   │   │   ├── 🖼️ nivel2_fondo.png
│   │   │   ├── 🖼️ nivel3_fondo.png
│   │   │   ├── 🖼️ personaje.png
│   │   │   └── 🖼️ logo.png
│   │   └── 📁 sonidos/            # Efectos y música ambiental
│   │       ├── 🔊 musica_nivel1.wav
│   │       ├── 🔊 musica_nivel2.wav
│   │       ├── 🔊 musica_nivel3.wav
│   │       ├── 🔊 respuesta_correcta.wav
│   │       └── 🔊 respuesta_incorrecta.wav
│
│   └── 📁 utilidades/             # Funciones complementarias
│       └── 📄 ReproductorSonido.java
│
│
└── 📚 lib/                         # Versión de Java usada para compilar y ejecutar el proyecto
    └── ☕ JDK 17
```

---
## 👨‍💻 Créditos
Proyecto desarrollado por:

- **Cruz Silva, Fabio David**
- **Morales Carlos, Edu**
