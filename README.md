## 📖 Descripción del Proyecto

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
> #### Paso 2:
> #### Paso 3:
> #### Paso 4:

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
