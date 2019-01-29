/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.DoubleSolenoid; // pneumatics
import edu.wpi.first.wpilibj.Compressor; // pneumatics
import edu.wpi.first.wpilibj.CameraServer; // camera

/**
* The VM is configured to automatically run this class, and to call the
* functions corresponding to each mode, as described in the IterativeRobot
* documentation. If you change the name of this class or the package after
* creating this project, you must also update the build.gradle file in the
* project.
*/
public class Robot extends IterativeRobot {
 private static final String kDefaultAuto = "Default";
 private static final String kCustomAuto = "My Auto";
 private String m_autoSelected;
 private final SendableChooser<String> m_chooser = new SendableChooser<>();
 private final Joystick m_stick = new Joystick(0);
 private final DifferentialDrive m_robotDrive = new DifferentialDrive(new PWMVictorSPX(0), new PWMVictorSPX(1));



/** pneumatics compressor */

  /**
  * This function is run when the robot is first started up and should be
  * used for any initialization code.
  */
 @Override
 public void robotInit() {
  m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
  m_chooser.addOption("My Auto", kCustomAuto);
  SmartDashboard.putData("Auto choices", m_chooser);
  Compressor c = new Compressor(0);
  DoubleSolenoid exampleDouble = new DoubleSolenoid(1, 2);
   
    c.setClosedLoopControl(true);
 }

 /**
  * This function is called every robot packet, no matter the mode. Use
  * this for items like diagnostics that you want ran during disabled,
  * autonomous, teleoperated and test.
  *
  * <p>This runs after the mode specific periodic functions, but before
  * LiveWindow and SmartDashboard integrated updating.
  */
 @Override
 public void robotPeriodic() {
 }

 /**
  * This function is called periodically during operator control.
  * Arcade Drive 1 joystick
  */
 @Override
 public void teleopPeriodic() {
   m_robotDrive.arcadeDrive(m_stick.getY(1), m_stick.getX(0));

  DoubleSolenoid exampleDouble = new DoubleSolenoid(1, 2);

  exampleDouble.set(DoubleSolenoid.Value.kOff);
  exampleDouble.set(DoubleSolenoid.Value.kForward);
  exampleDouble.set(DoubleSolenoid.Value.kReverse);
 }

 /**
  * This function is called periodically during test mode.
  * Arcade Drive 2 joysticks
  */
 @Override
 public void testPeriodic() {
   m_robotDrive.arcadeDrive(m_stick.getY(1), m_stick.getX(4));
 }
}

