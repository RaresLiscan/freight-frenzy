package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Mechanom extends LinearOpMode {

    RobotMap robot;

    @Override
    public void runOpMode() throws InterruptedException {

        robot = new RobotMap(hardwareMap, this);

        waitForStart();
        while (opModeIsActive()){
            double f= gamepad1.left_stick_y;
            double r= -gamepad1.right_stick_x;
            double s= -gamepad1.left_stick_x;
            robot.stangaFata.setPower(f+r+s);
            robot.stangaSpate.setPower(f+r-s);
            robot.dreaptaFata.setPower(-f+r+s);
            robot.dreaptaSpate.setPower(-f+r-s);

//            if (gamepad1.dpad_up){
//                s1.setPosition(1);
//            }
//            if (gamepad1.dpad_left){
//                s1.setPosition(0.5);
//            }
//            if (gamepad1.dpad_down){
//                s1.setPosition(0);
//            }
        }
    }
}
