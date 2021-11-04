package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Mariuta extends LinearOpMode {

    DcMotor spateStanga;
    DcMotor spateDreapta;
    DcMotor fataStanga;
    DcMotor fataDreapta;

    @Override
    public void runOpMode() throws InterruptedException {
        spateStanga = hardwareMap.get(DcMotor.class,"spateStanga");
        spateDreapta = hardwareMap.get(DcMotor.class,"spateDreapta");
        fataStanga = hardwareMap.get(DcMotor.class,"fataStanga");
        fataDreapta = hardwareMap.get(DcMotor.class,"fataDreapta");

        waitForStart();

        while (opModeIsActive()){
            double f = -gamepad1.left_stick_y;
            double r = gamepad1.right_stick_x;
            spateStanga.setPower(f+r);
            fataStanga.setPower(f+r);
            spateDreapta.setPower(-f+r);
            fataDreapta.setPower(-f+r);


        }
    }
}
