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
	float barPieces = 5;

	int barLength = 20;
	char currentIterationChar = '|';
	char iterationsLeftChar = '.';
	String currentIterationString = '';
	char statusBarPrefix = '[';
	char statusBarSuffix = ']';
	int currentIteration = 0;
	float percentageDone = 0.00;
	float spinnerSpeed = 0.25;

	// Class constructor
	public Jtclisbar(String headline, int totalIterations){
		// functionality goes here
		this.updateCalculatedValues();
	}

	// Overriding method run
	public void run(){
		// functionality goes here
	}

	private void updateCalculatedValues(){
		this.barPieces = 100 / this.barLength;
		this.iterationsLeftString = this.barLength * this.iterationsLeftChar;
	}

}
