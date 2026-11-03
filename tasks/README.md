# Study tasks and instructions

This directory contains deidentified versions of the tasks and instructions used in the study, including the Java implementations, starter JUnit tests, participant instructions, and consent form.

Names, institutional references, contact details, account identifiers, survey and submission destinations, and clickable links have been removed or generalized. Participant ID is a neutral replacement for the original institutional identifier. Externally hosted illustrations are represented by text examples. The consent form is an archival, deidentified copy; it is not a form for recruiting new participants. Its course-specific credit details have been generalized. The Java source and starter tests are unchanged.

The instructions below preserve the task order, time limits, recording requirements, and testing workflow used in the study.

## Extra credit instructions

 This homework consists of two tasks: (1) MarsRover and (2) BowlingScoreKeeper.

#### Table of Contents
* Important Notes
* Task 0 Start Recording
* Task 1 MarsRoverAPI
* Task 2 BowlingScoreKeeper
* Task 3 Submission

## Important Notes

1. Before you get started, complete the consent form and the pre-study survey about your confidence in unit testing using the materials supplied by the research team. Survey destinations have been removed from this archival copy.

2. 🟢 **TestCompass:** You are *only required* to use TestCompass to assist you in this homework. The screen recording (explained below) you submit should demonstrate your compliance with this requirement. **TestCompass** is an IntelliJ IDEA plugin that can help you reason about what behavior to test, suggest useful test scenarios, and review whether your JUnit tests cover the task requirements; to use it, **please refer to the plugin instructions supplied with the study materials for guidance on how to use this plugin. When using the plugin, please wait for the response before trying again, as repeated requests may reach the AI service’s usage limits and temporarily prevent recommendations from being generated.**


3. **Order of Completion:** You *must* complete the two tasks in the specified order. That is, you should begin with *MarsRover*, followed by *BowlingScoreKeeper*. You must also complete both tasks in a single session, with allowances for short breaks only. The screen recording (explained below) you submit should demonstrate your compliance with these requirements.

4. **Recording:** For this homework, you *must* record your screen from the moment you start working on the first tasks until you have completed them all. You may read through this README file and the README files for the two tasks (MarsRover and BowlingScoreKeeper) *before* you start recording. However, please begin your screen recording prior to initiating the cloning of this repository, and continue recording throughout the completion of all assigned tasks (i.e., both MarsRover and BowlingScoreKeeper). Do not stop the recording until after you have successfully submitted all the required zip files.

5. **Timing Constraints:** Each task has a designated time limit — 40 minutes for MarsRover and 60 minutes for BowlingScoreKeeper. These durations have been carefully tested and determined and should be sufficient for you to achieve satisfactory performance. While we understand that technical issues can arise, you are permitted a time extension of up to 20% beyond these limits if necessary. You may read through the README files for each task (MarsRover and BowlingScoreKeeper) to familiarize yourself with the requirements before you begin the actual timing of your work in IntelliJ IDEA.

In other words, you should time yourself starting at the moment when you start working in IntelliJ IDEA. The screen recording you submit should demonstrate your compliance with these timing constraints, from the initiation to the completion of each task.


1. **Operating System:** You may use any operating system to complete this task, provided all activities are conducted within IntelliJ IDEA.

Below, we have provided guidance to help you get started.



## Task 0 Start Recording

*To complete this homework, you must record your screen separately while working on each of the two tasks. Therefore, you will need to submit two separate screen recordings in total.*

#### For macOS Users:

1. **Open QuickTime Player:** Go to your Applications folder and open QuickTime Player.
2. **Start New Screen Recording:** In the QuickTime Player menu, click on "File" and then select "New Screen Recording."
3. **Choose Recording Options:** Click on the down arrow next to the record button to choose your microphone if you want to record audio as well. You can also choose to show mouse clicks in the recording.
4. **Select Recording Area:** Click on the record button. You can choose to record the entire screen by clicking anywhere on the screen, or you can drag to select a specific area to record.
5. **Stop Recording:** When you are finished, click the stop button in the menu bar at the top of your screen. You can also press Command + Control + Esc to stop.
6. **Save Recording:** After stopping, QuickTime Player will automatically open the recording. You can now save the file by going to "File" and then "Save."

#### For Windows Users:

1. **Open Game Bar:** Press the Windows key + G to open the Game Bar. If it's your first time using it, you might need to enable it in Settings > Gaming > Game Bar.
2. **Start Recording:** Click on the "Start Recording" button (a circle with a dot) or press Windows key + Alt + R to begin recording.
3. **Stop Recording:** Click the "Stop Recording" button (a square) or press Windows key + Alt + R again to stop the recording.
4. **Access Recording:** Once you stop recording, a notification will pop up saying "Game clip recorded." Click on the notification to view your recording, or find it in the "Videos" folder under "Captures."

#### For Linux Users:

For Linux, there are various screen recording tools available. Here's how to use one of the popular tools, SimpleScreenRecorder:

1. **Install SimpleScreenRecorder:** You can install it via your package manager. For example, on Ubuntu, you can use the command: `sudo apt-get install simplescreenrecorder`
2. **Open SimpleScreenRecorder:** Launch the application from your applications menu.
3. **Configure Settings:** Select your recording area, frame rate, and other settings. You can also choose to record audio.
4. **Start Recording:** Click the "Start Recording" button to begin recording your screen.
5. **Stop Recording:** Click the "Stop Recording" button when you are finished. Your recording will be saved in the location you specified in the settings.

## Task 1 MarsRoverAPI

**Setup Instructions**

1. Download or clone this repository to your local machine.
2. Open IntelliJ IDEA.
3. Open the `MarsRover` folder as a project.
4. Review the task-specific instructions in MarsRover/README.md before you begin editing.

Congratulations, you are ready to start.

**Task Requirement**

This is a testing task, not an implementation task. Your goal is to add JUnit tests that check the behavior of the provided `MarsRover` implementation.

- Work only in `MarsRover/src/MarsRoverTest.java`.
- Do not modify `MarsRover/src/MarsRover.java`.
- You may keep, change, or remove the starter example test, as long as your final test file thoroughly verifies the required behavior.
- Time limit: 40 minutes, with up to 20% extra time if needed.

**Submission Instructions **

1. Make sure your completed work is saved in `MarsRover/src/MarsRoverTest.java`.
2. Close IntelliJ IDEA, if necessary, to ensure all files are fully saved to disk.
3. You may now stop the screen recording. Save the recording to your local computer and rename it as `<ParticipantID_Video_Task1>`.
4. Compress the entire `MarsRover` folder into a `.zip` file.
5. Rename the ZIP file to `<ParticipantID_Task1>.zip`.
6. Submit `<ParticipantID_Task1>.zip` and `<ParticipantID_Video_Task1>` through the submission channel supplied by the research team. The submission destination has been removed from this archival copy.

Congratulations, you just finished Task 1. Continue to Task 2 BowlingScoreKeeper.

## Task 2 BowlingScoreKeeper

**Setup Instructions**

1. Open the `BowlingScoreKeeper` folder as a project in IntelliJ IDEA.
2. Review the task-specific instructions in BowlingScoreKeeper/README.md before you begin editing.

Congratulations, you are ready to start.

**Task Requirement**

This is also a testing task. Your goal is to add JUnit tests that check the behavior of the provided bowling score keeper implementation.

- Work only in `BowlingScoreKeeper/src/FrameTest.java` and `BowlingScoreKeeper/src/BowlingGameTest.java`.
- Do not modify `BowlingScoreKeeper/src/Frame.java` or `BowlingScoreKeeper/src/BowlingGame.java`.
- You may keep, change, or remove the starter example tests, as long as your final test files thoroughly verify the required behavior.
- Time limit: 60 minutes, with up to 20% extra time if needed.

**Submission Instructions**

1. Make sure your finished work is saved in `BowlingScoreKeeper/src/FrameTest.java` and `BowlingScoreKeeper/src/BowlingGameTest.java`.
2. Close IntelliJ IDEA if needed so all files are fully written to disk.
3. You may now stop the screen recording. Save the recording to your local computer and rename it as `<ParticipantID_Video_Task2>`.
4. Compress the entire `BowlingScoreKeeper` folder into a zip file.
5. Rename the zip file to `<ParticipantID_Task2>.zip`.
6. Submit `<ParticipantID_Task2>.zip` and `<ParticipantID_Video_Task2>` through the submission channel supplied by the research team. If submission fails, contact the research team using the details supplied separately. Submission destinations and contact details have been removed from this archival copy.

## Task 3 Submission
- A final checklist for all the files you should have submitted by now: (1) <ParticipantID_Task1>.zip, (2) <ParticipantID_Task2>.zip, (3) <ParticipantID_Video_Task1>, and (4) <ParticipantID_Video_Task2>.
- Please complete the short post-study survey supplied by the research team. The survey destination has been removed from this archival copy.

Congratulations, you just finished ALL tasks in this study!!!
