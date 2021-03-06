package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by mingch on 12/2/17.
 */

@TeleOp(name = "NewClawTest")
public class NewClawTest extends LinearOpMode{

    private Servo leftServo, rightServo;

    @Override

    public void runOpMode(){

        leftServo = hardwareMap.servo.get("leftServo");
        rightServo = hardwareMap.servo.get("rightServo");

        leftServo.setPosition(0);
        rightServo.setPosition(0);

        double position = 0;

        waitForStart();

        while(opModeIsActive()){

            if(gamepad2.a) {
                leftServo.setPosition(1);
                rightServo.setPosition(1);
                position = 1;

            }

            if(gamepad2.b) {
                leftServo.setPosition(0);
                rightServo.setPosition(0);
                position = 0;
            }

            if(gamepad2.x && (position <= 1)){
                position += 0.01;
                leftServo.setPosition(position);
                rightServo.setPosition(position);

            }

            if(gamepad2.y && (position >= 0)){
                position -= 0.01;
                leftServo.setPosition(position);
                rightServo.setPosition(position);
            }

        }



    }

}
