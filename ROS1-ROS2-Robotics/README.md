# ROS1 and ROS2 – My Robotics Progress

This repository combines my work in both ROS 1 and ROS 2, focusing on the open-source Dingo Quadruped Robot in ROS1 and my learnings in ROS2. It includes technical documentation, simulation instructions, and code exploration for understanding robot control and simulation in both environments.

---

## ROS 1 – Dingo Quadruped Project

This folder documents my work on the Dingo Quadruped Robot using ROS 1. While I have not formally learned ROS 1, I am actively working on this open-source project to understand its structure, behavior, and simulation flow.

### Documentation Files

- **Dingo Control.pdf**  
  Explains the working of the `dingo_control` package including PS4 controller input, gait logic, and robot movement.

- **Folder Dingo.pdf**  
  Provides a structural overview of the `DingoQuadruped` repository; useful as a folder map.

- **Leg Actuation using ROS.pdf**  
  Describes leg control using ROS messages and command topics.

- **dingo package analysis.pdf**  
  Analyzes key Python files such as `dingo_driver.py`, `GaitGenerator.py`, and `config.py`.

- **dingo gazebo simulation.pdf**  
  Gives step-by-step instructions for simulating the Dingo robot in Gazebo.

- **dingo_description.md**  
  Explains URDF/Xacro structure and how the robot is visualized in RViz and simulated in Gazebo.

### Original Dingo Quadruped Repository

This work is based on the open-source repo:  
[https://github.com/Yerbert/DingoQuadruped](https://github.com/Yerbert/DingoQuadruped/tree/master)

### How to Use

1. Clone or download the original repository.
2. Follow instructions in each document for simulation and control.
3. Use the PDFs to understand specific components of the system.

---

## ROS 2 – Learning and Documentation

This section contains self-learning documentation for ROS 2, designed from a beginner’s point of view. All documents include step-by-step instructions, code, and explanations.

Note: To access links inside the documents, please download them locally.

### Included Documents

#### 1. ROS2 Basics  
- Covers core concepts: Nodes, Topics, Services, Actions  
- Includes Python scripts and terminal commands  
- Explains each line of code and its purpose  
- YouTube Reference: [https://youtu.be/Gg25GfA456o?si=6NZVEkio-IMsZXpL](https://youtu.be/Gg25GfA456o?si=6NZVEkio-IMsZXpL)

#### 2. ROS2 Installation  
- Installation guide for ROS 2 Humble on Ubuntu 22.04  
- Includes dependencies, commands, and environment setup

#### 3. Basic Robot URDF Generation and RViz  
- Steps to export URDF from Fusion 360  
- Folder structure and mesh placement  
- Visualizing models in RViz with TFs and joint states

#### 4. Gazebo Simulation of a Basic Robot *(In Progress)*  
- Instructions for launching URDF/Xacro models in Gazebo  
- Integration of sensors and plugins  
- Common error handling (to be updated)

### Document Status

| Document                             | Status       |
|--------------------------------------|--------------|
| ROS2 Basics                          | Complete     |
| ROS2 Installation                    | Complete     |
| Basic robot URDF + RViz              | Complete     |
| Gazebo Simulation (basic robot)      | In Progress  |

---

## Summary

This repository showcases two sides of my robotics work:

- ROS 1: Hands-on exploration of an existing quadruped robot including simulation and control.
- ROS 2: Structured, beginner-friendly learning with working examples and explanation.

This project folder serves as both a portfolio and a learning archive for future robotics work and experimentation.


