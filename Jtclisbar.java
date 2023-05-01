package de.bolben.utils

public class Jtclisbar extends Thread {

	char animationStepOne = '|';
	char animationStepTwo = '/';
	char animationStepThree = '-';
	char animationStepFour = '\\';
	char animationStepFive = '/';
	char animationStepSix = '-';
	char animationStepSeven = '\\';

	String statusHeadline = '';
	int totalIterations = 1;

	int barLength = 20;
	char currentIterationChar = '|';
	char iterationsLeftChar = '.';
	String currentIterationString = '';
	char statusBarPrefix = '[';
	char statusBarSuffix = ']';
	int currentIteration = 0;
	float percentageDone = 0.00;
	float spinnerSpeed = 0.25;

	// need to call method 'updateCalculatedValues'

	// Class constructor
	public Jtclisbar(String headline, int totalIterations){
		// functionality goes here
	}

	// Overriding method run
	public void run(){
		// functionality goes here
	}
}
