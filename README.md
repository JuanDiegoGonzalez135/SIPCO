# 💰 Sistema Contable

Aplicación web para la gestión de finanzas personales, desarrollada como una evolución de uno de mis primeros proyectos universitarios.

El proyecto busca reconstruir y ampliar el sistema original utilizando tecnologías y prácticas de desarrollo adquiridas posteriormente, incorporando una arquitectura backend estructurada, autenticación segura, una interfaz moderna y herramientas de documentación, testing y despliegue.

> 🚧 **Proyecto en desarrollo**

---

## 🎯 Objetivo

El objetivo es desarrollar una aplicación que permita a los usuarios llevar un control organizado de sus ingresos y gastos, consultar su información financiera y visualizar el comportamiento de sus finanzas mediante diferentes métricas y reportes.

Este proyecto también funciona como un ejercicio personal para reforzar conocimientos de desarrollo Full Stack, arquitectura backend, seguridad, testing, Docker y CI/CD.

---

## 🛠️ Tecnologías

### Frontend

* React
* Tailwind CSS

### Backend

* Java
* Spring Boot
* Spring Security
* JWT
* JPA / Hibernate

### Base de datos

* MySQL

### API

* REST
* Swagger / OpenAPI

### Testing

* JUnit
* Mockito

### Herramientas

* Git
* GitHub
* Docker
* Docker Compose
* GitHub Actions

---

## ✨ Funcionalidades

### 🔐 Autenticación y usuarios

* [ ] Registro de usuarios
* [ ] Inicio de sesión
* [ ] Autenticación mediante JWT
* [ ] Autorización mediante roles
* [ ] Recuperación de contraseña

### 💰 Ingresos

* [ ] Registrar ingresos
* [ ] Editar ingresos
* [ ] Eliminar ingresos
* [ ] Consultar ingresos
* [ ] Filtrar ingresos

### 💸 Gastos

* [ ] Registrar gastos
* [ ] Editar gastos
* [ ] Eliminar gastos
* [ ] Consultar gastos
* [ ] Filtrar gastos

### 🏷️ Categorías

* [ ] Crear categorías
* [ ] Editar categorías
* [ ] Eliminar categorías
* [ ] Consultar categorías

### 📊 Dashboard

* [ ] Balance general
* [ ] Ingresos del periodo
* [ ] Gastos del periodo
* [ ] Gastos por categoría
* [ ] Últimos movimientos

### 📑 Reportes

* [ ] Filtrar movimientos por fecha
* [ ] Filtrar por categoría
* [ ] Filtrar por tipo de movimiento
* [ ] Generar reportes

---

## 🏗️ Arquitectura

El backend seguirá una arquitectura por capas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

El frontend y backend estarán separados y se comunicarán mediante una API REST.

---

## 🗂️ Estructura general

```text
sistema-contable/
│
├── backend/
│
├── frontend/
│
├── docs/
│
└── README.md
```

La estructura podrá modificarse conforme avance el desarrollo.

---

## 🧪 Testing

El proyecto incorporará pruebas automatizadas para validar el comportamiento de los componentes principales del backend.

Se utilizarán principalmente:

* JUnit
* Mockito
* Spring Boot Test

---

## 🐳 Docker

El proyecto será preparado para ejecutarse mediante contenedores utilizando Docker y Docker Compose.

---

## 🔄 CI/CD

Se planea implementar un flujo básico de integración continua utilizando GitHub Actions.

---

## 📚 Documentación de la API

La API será documentada mediante Swagger / OpenAPI.

---

## 🚀 Estado del proyecto

### Versión actual

**v0.1 — Planificación**

Actualmente se está definiendo la arquitectura inicial y preparando la estructura del proyecto.

### Próximas etapas

* [ ] Configuración inicial del backend
* [ ] Configuración inicial del frontend
* [ ] Configuración de la base de datos
* [ ] Implementación de autenticación
* [ ] Implementación de usuarios
* [ ] Implementación de categorías
* [ ] Implementación de ingresos y gastos
* [ ] Dashboard
* [ ] Reportes
* [ ] Testing
* [ ] Docker
* [ ] CI/CD
* [ ] Deploy

---

## 📖 Sobre el proyecto

Este proyecto es una evolución de uno de mis primeros proyectos universitarios. La intención de esta nueva versión es aplicar los conocimientos adquiridos desde entonces y explorar herramientas y prácticas que permitan construir una aplicación más estructurada, mantenible y cercana a un entorno profesional.
