/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
 
public class SolenoidForward extends Command {

    public static DoubleSolenoid solenoid1 = new DoubleSolenoid(0, 1);

    public SolenoidForward() {
        solenoid1.set(DoubleSolenoid.Value.kForward); 
        //	requires();
    }

    protected void initialize() {
    }

    @Override
    protected void execute() {
    	solenoid1.set(DoubleSolenoid.Value.kForward); 
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}

