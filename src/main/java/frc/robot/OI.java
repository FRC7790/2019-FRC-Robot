/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
// import edu.wpi.first.wpilibj.DoubleSolenoid;

import frc.robot.commands.SolenoidForward;
// import frc.robot.commands.SolenoidReverse;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    // Create the joystick and the 8 buttons on it
    Joystick leftJoy = new Joystick(0);
    
	  JoystickButton buttonA = new JoystickButton(leftJoy, 1),
			buttonB = new JoystickButton(leftJoy, 2);

   // private Joystick joy = new Joystick(0);

    public OI() {

      // JoystickB q1utton a = new JoystickButton(joy, 1);
      // JoystickButton b = new JoystickButton(joy, 2);

      // a.whenPressed(new SolenoidForwardCommand());
      // b.whenPressed(new SolenoidReverseCommand());

    // change names of commands
      buttonA.whenPressed(new SolenoidForward()); // solenoid forward
		  // buttonB.whenPressed(new SolenoidReverse()); // solenoid reverse
    }

    public Joystick getJoystick() {
      return leftJoy;
    }

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
