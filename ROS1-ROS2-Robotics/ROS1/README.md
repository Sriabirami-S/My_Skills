# ROS 1 – Dingo Quadruped Project

This folder documents my work on the **Dingo Quadruped Robot** using **ROS 1**. While I have not formally learned ROS 1, I am working on this open-source project to understand its structure, behavior, and simulation flow.

All supporting documentation, analysis, and observations are included here.

---

## Documentation Files

- **Dingo Control.pdf**  
  Explains the working of the `dingo_control` package including the use of PS4 controller, gait logic, and movement control.

- **Folder Dingo.pdf**  
  Structure and overview of the DingoQuadruped repository files. Acts as a visual map of the folder system.

- **Leg Actuation using ROS.pdf**  
  Notes on how leg movement is controlled using ROS messages. Includes topics and control logic from code.

- **dingo package analysis.pdf**  
  A deep dive into the important Python packages within the repo such as `dingo_driver.py`, `GaitGenerator.py`, and `config.py`.

- **dingo gazebo simulation.pdf**  
  Step-by-step simulation setup in Gazebo for the Dingo robot. Covers launch file usage and visualization.

- **dingo_description.md**  
  Separate detailed description of the robot's URDF/Xacro structure and its integration with RViz and Gazebo.

---

## Original Dingo Quadruped Repository

This work is based on the open-source repo:  
https://github.com/Yerbert/DingoQuadruped/tree/master

---

## How to Use

1. Clone or download the main [repository](https://github.com/Yerbert/DingoQuadruped/tree/master/dingo_ws/src)
2. Follow the simulation and control steps in each file.
3. Refer to each PDF for understanding specific components of the system.


