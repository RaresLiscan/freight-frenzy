package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Gicu extends LinearOpMode {
    //attr
    DcMotor stangaFata;
    DcMotor dreaptaFata;
    DcMotor stangaSpate;
    DcMotor dreaptaSpate;
    //met
    @Override
    public void runOpMode() throws InterruptedException {

        stangaFata=hardwareMap.get(DcMotor.class, "stangaFata");
        dreaptaFata=hardwareMap.get(DcMotor.class, "dreaptaFata");
        stangaSpate=hardwareMap.get(DcMotor.class,"stangaSpate");
        dreaptaSpate=hardwareMap.get(DcMotor.class, "dreaptaSpate");

        waitForStart();

        while(opModeIsActive()) {
            double f= -gamepad1.left_stick_y;
            double r=gamepad1.right_stick_x;
            stangaFata.setPower(f+r);
            stangaSpate.setPower(f+r);
            dreaptaSpate.setPower(-f+r);
            dreaptaFata.setPower(-f+r);
        }

    }
}
