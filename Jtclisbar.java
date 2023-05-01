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
	char animationStep = '|';

	// Class constructor
	public Jtclisbar(String headline, int totalIterations){
		this.statusHeadline = headline;
		this.totalIterations = totalIterations;
		this.updateCalculatedValues();
	}

	// Overriding method run
	public void run(){
		System.out.println("\n" + this.statusHeadline);
		for(int i = 1; this.currentIteration < this.totalIterations; i++;){
			switch(i){
				case 1:
					this.animationStep = this.animationStepOne;
					break;
				case 2:
					this.animationStep = this.animationStepTwo;
					break;
				case 3:
					this.animationStep = this.animationStepThree;
					break;
				case 4:
					this.animationStep = this.animationStepFour;
					break;
				case 5:
					this.animationStep = this.animationStepFive;
					break;
				case 6:
					this.animationStep = this.animationStepSix;
					break;
				case 7:
					this.animationStep = this.animationStepSeven;
					i -= 7;
					break;
			}

			System.out.print("\r" + 
					this.statusBarPrefix + 
					this.currentIterationString + 
					this.animationStep + 
					this.iterationsLeftString + 
					this.statusBarSuffix + 
					this.percentageDone + " ");
		}

		if(this.currentIteration == this.totalIterations){
			System.out.print("\r" + this.statusBarPrefix +
					this.currentIterationString + 
					this.statusBarSuffix +
					this.percentageDone + " ");
			System.out.println();
			return
		}

	}

	private void updateCalculatedValues(){
		this.barPieces = 100 / this.barLength;
		this.iterationsLeftString = this.barLength * this.iterationsLeftChar;
	}

	private void updatePercentageDone(){
		this.percentageDone = this.currentIteration / this.totalIterations * 100;

	private void updateValues(){
		this.updatePercentageDone();
		this.updateCurrentIterationString();
		this.updateIterationsLeftString();
	}

	public void setCurrentIteration(int currentIteration){
		this.currentIteration = currentIteration;
		this.updateValues;
		}


}
