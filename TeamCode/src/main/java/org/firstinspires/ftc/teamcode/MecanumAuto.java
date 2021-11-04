package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class MecanumAuto extends LinearOpMode
{
    RobotMap robot;
    @Override
    public void runOpMode() throws InterruptedException {
        robot = new RobotMap(hardwareMap, this);


        waitForStart();
        if (opModeIsActive()) {

//            robot.runUsingEncoders(0.3, 500, 3);
            robot.runUsingEncoders(0.6, 5000, 3);
            robot.rotate(88, 0.2, 3);
            robot.runUsingEncoders(0.6,1500,3);
            robot.rotate(43,0.2,3);
            robot.runUsingEncoders(0.6,1500,3);
            robot.rotate(40,0.2,3);
            robot.runUsingEncoders(0.6,2000,3);
            robot.rotate(328,1,5);
            robot.stopDriving();
        }
    }
}
