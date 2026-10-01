# deisiGreatGame

Turn-based multiplayer board game implemented on the JVM as a programming project.

## Overview

Players explore a cave-themed board and try to reach the end while dealing with hazards, tools and game events.

The game supports **2 to 4 players** and includes a graphical viewer provided as an external library.

## Features

- multiplayer turn-based gameplay
- board movement and game-state management
- hazards and tools
- player progression
- graphical game visualization
- domain-oriented object modelling

## Tech

- JVM
- Object-Oriented Programming
- External JAR integration

## Running the project

The repository includes the required GUI library under `lib/`.

Configure the provided JAR as a project dependency and use:

```text
pt.ulusofona.lp2.deisiGreatGame.guiSimulator.AppLauncherKt
```

as the application entry point.

## Background

Originally developed for a Programming Languages course, this project demonstrates object-oriented design, state management and implementation of non-trivial game rules.
