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

### Demostración guiada:
> #### Paso 1: Pantalla de bienvenida
> Aquí inicia la historia. Lee con atención la introducción, ya que contiene pistas para los acertijos.
<img width="675" height="459" alt="image" src="https://github.com/user-attachments/assets/14100fb2-3fcb-4164-be74-63ef956ccc1a" />

> #### Paso 2: Menú principal
> Haz clic en “Comenzar Aventura” para iniciar el reto dentro de la pirámide.
<img width="676" height="551" alt="image" src="https://github.com/user-attachments/assets/7558cdbf-5df4-40e8-8a1f-8a3c889be47a" />

> #### Paso 3: Inicia el primer reto
<img width="577" height="358" alt="image" src="https://github.com/user-attachments/assets/da22d4ae-ce39-48af-a99b-fbda214347a5" />

> #### Paso 4: Primer acertijo
> Se presenta el primer desafío. Lee la pregunta y selecciona la respuesta que creas correcta.
<img width="577" height="351" alt="image" src="https://github.com/user-attachments/assets/7cd2cc68-1213-48de-80bc-144bf2b693f9" />

> #### Paso 5: Respuesta correcta
> Si respondes bien, avanzas al siguiente nivel. ¡Sigue resolviendo!
<img width="575" height="356" alt="image" src="https://github.com/user-attachments/assets/f8012f8b-75ad-4dab-bee3-58ec3a135811" />

> #### Paso 6: Inicia el segundo reto
<img width="577" height="359" alt="image" src="https://github.com/user-attachments/assets/eaf9f0c1-6c7c-4beb-aa1b-ab893648f40d" />

> #### Paso 7: Segundo acertijo
> Se presenta el segundo desafío. Lee la pregunta y selecciona la respuesta que creas correcta.
<img width="575" height="356" alt="image" src="https://github.com/user-attachments/assets/db65201a-fc2c-44e8-a4b3-661ff2c4bbce" />

> #### Paso 8: Respuesta correcta
> Si respondes bien, avanzas al siguiente nivel. ¡Sigue resolviendo!
<img width="577" height="355" alt="image" src="https://github.com/user-attachments/assets/5c532e57-ac7c-4d4b-91ed-67ff86b82e6c" />

> #### Paso 9: Inicia el ultimo reto en la camara del tesoro...
<img width="575" height="356" alt="image" src="https://github.com/user-attachments/assets/8386c979-45da-4286-b7bd-24b8cad24163" />

> #### Paso 10: Tercer acertijo
> > > Se presenta el tercer desafío. Lee la pregunta y selecciona la respuesta que creas correcta.
<img width="570" height="356" alt="image" src="https://github.com/user-attachments/assets/72f9269d-84b4-4468-a309-ac6d8254c8c3" />

> #### Paso 11: Respuesta correcta
> Si respondes bien, ya terminarias los retos que tenia la pirámide antigua
<img width="575" height="351" alt="image" src="https://github.com/user-attachments/assets/6a4a7d35-256d-4ee9-8b9c-e0061a8e7737" />

> #### Paso 12: Felicitaciones al jugador
> ¡Felicidades! Si llegaste a esta pantalla, significa que lograste resolver todos los retos de la pirámide y escapaste con éxito. Tu ingenio y perseverancia te han llevado a la victoria. ¡Gracias por jugar!
<img width="677" height="458" alt="image" src="https://github.com/user-attachments/assets/ed454526-499a-4ebc-b60f-864ddd87440b" />

> #### Paso 13: Créditos
> Aquí se muestran los créditos de los desarrolladores que hicieron posible este juego. ¡Agradecemos tu tiempo y esperamos que hayas disfrutado la aventura!
<img width="670" height="451" alt="image" src="https://github.com/user-attachments/assets/997f613c-727b-495c-9e3f-468fc9d78258" />

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
