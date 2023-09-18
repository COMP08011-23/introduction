<!--
# 2021 Notes
- Add "Command-Line refresher" section, covering cd, cp, mkdir running scripts
- Remove section on running tests. Discourage students from running tests locally (focus on manually testing for understanding)
-->

# Introduction to Distributed Systems Labs

## Aims
The aim of this introductory lab is to become familiar with the workflow you'll be using for the labs and assignments in this module. You'll learn how to:
- accept an assignment on Github Classroom
- access your virtual machine (VM) on Azure Labs
- use your VM to work on the assignment
- review autograder output on Github Classrom


## Accepting an Assignment on Github Classroom
### First Time: Mapping your name to your Github username
We'll be using Github Classroom to manage assignments. You'll accept a lab/assignment by clicking on the link on Moodle. **The first time you accept a lab/assignment in Github Classroom, you'll need to select your name from the list of users in the classroom (if you're reading this on Github then hopefully you've already done this)**. This allows Github Classroom to map your name to your Github username. This only needs to be done the first time you access Github Classroom for the module.
### Accepting an assignment
When you accept a Github Classroom lab/assignment by clicking on the link in Moodle, Github Classroom will create an individual repository (repo for short) just for you. This repo will contain starter code and autograding files. It will have your Github username as part of the repo name (e.g. `COMP08011-21/introduction-john-french`). If you're reading this on Github then this repository should be the one created for you by Github Classroom.

- **In Github verify that your Github username is part of the repo name.**

**Always use the repo that Github Classroom creates for you to do labs and assignments in this module**. 
**NEVER FORK THE REPO CREATED FOR YOU.** If you fork it then I won't be able to track your work and give you credit for it. You'll clone the repo to work on your labs/assignments.

## Accessing your VM on Azure Lab Services
A virtual machine (VM) has been assigned to you in the DISTRIBUTED_SYSTEMS-YY lab on azure labs [https://labs.azure.com](https://labs.azure.com).
### Registering for the Azure Lab
The first time you access a lab in Azure Lab Services you'll need to register to get the VM assigned to you. To do this:
- Go to [labs.azure.com](https://labs.azure.com). In the top right corner you should see a PC icon (`My Virtual Machines`) next to your profile icon. Check if any VMs are visible here. 
 
![image](https://user-images.githubusercontent.com/26874254/134693257-3681eb97-d8d6-4331-89cd-8d56c0097556.png)

![image](https://user-images.githubusercontent.com/26874254/134699869-deef46a3-2118-4525-92e2-dc002e858d09.png)

- If no VMs are visible under `My Virtual Machines` in Azure Lab Services, then open [Microsoft Teams in the browser](https://teams.microsoft.com) and go to the Azure Lab Services tab under the Distributed Systems channel in Teams. This should automatically register you for the lab and assign you a VM. 
- Go to `My Virtual Machines` in this tab.

- Switch the machine on by sliding the `Stopped` switch to on.

- To connect to the VM, click the 🖥️ icon and select `Download RDP File`. RDP stands for Remote Desktop Protocol. 

![image](https://user-images.githubusercontent.com/26874254/134700708-73c8484f-7a01-4af0-b42e-b94ac4627d97.png)

- Open the downloaded RDP file. This will open the windows RDP tool (you can also run this tool manually by searching for RDP in the windows search box). Select the check box `Don't ask me again for connections to this computer` and press `Connect`.

![image](https://user-images.githubusercontent.com/26874254/134700974-c4d2f72c-53de-484b-af10-e8ca172581c1.png)

- In the next prompt regarding identity and certficates, select the checkbox that says `Don't ask me again for connections to this computer`, then select `Yes`.

![image](https://user-images.githubusercontent.com/26874254/134701641-22b1e478-d6f5-4bae-96b5-a3db02eea68f.png)

- You should then be prompted for credentials. The username of your VM is `comp08011` (the course code), and the password is `Comp08011`. Select the `Remember me` checkbox for convenience. **
that nobody else can access your VM using these credentials unless they have your Office 365/ATU login details, or you give them the RDP information (host name and port). Don't share these details with anyone.**

- You should now be connected to your VM in Azure. 

## Disconnecting and Shutting down your VM
In order to conserve VM credits, shutdown your VM when you're finished work by:
- Closing the RDP connection (exit the RDP program), and/or
- Manually shutting down the VM under `My Virtual Machines` in the `Azure Lab Services` tab in Teams.

## Using your VM to begin work on the assignment
Your VMs have been preconfigured with a development environment tailor-made for this module. It's strongly recommended (though not mandatory) that you do all your lab and assignment work for this module in this VM. Your lectures is investing his time in providing and supporting these VMs in Azure, no support will be provide for working outside these VMs.

**Note that your VM can be accessed anywhere, from lab machines in ATU and from your own machine at home, including Mac and Linux machines. RDP clients are available for all of these platforms.**

- Copy the clone URL for your repo in Github 
  - (make sure it's the repo with your Github username in the name, **not** any other repo)
- Open  Windows Terminal in your VM. It will open in your home directory `/home/comp08011` by default.
- **Clone** your repo to your VM:
```
git clone <CLONE URL FOR YOUR REPO>
```
- The repo with the starter code will be saved on your file system where you've cloned it, e.g. `/home/comp08011/introduction`.
- Open IntelliJ IDEA
- From IntelliJ IDEA, open the folder containing the starter code repo.
- You should now be able to access the repo files within IntelliJ.

## Completing the assignment
The actual assignment is a simple programming task requiring you to write 3 simple methods which will:
- calculate the total GAA score based on the goals and points scored
- sum the values in an array
- determine if a string begins with a consonant

Skeletons for the methods are contained in the file `Introduction.java`. The method's javadoc explains how it should work. Write your solution where it says ``YOUR CODE HERE``. 
<!--
### Tests
Tests used by the autograder are in `IntroductionTest.java`. You can run the tests locally yourself 3 different way. Try running the tests each of the following ways:

- Manually by opening the class `IntroductionTest.java` and clicking the run button:

![image](https://user-images.githubusercontent.com/26874254/134693901-14686779-194c-43c9-902d-f2b2a3898b0b.png)

- Using the build tool maven from the IDE by clicking on the `Maven` tab on the right of the screen and running the `test` goal.

![image](https://user-images.githubusercontent.com/26874254/134694060-80558d61-63c7-428b-9471-42c21b51026e.png)

- Using the build tool maven from the command line by navigating to your repo in the terminal and running the command `mvn test`.
-->

### Commit
**Good developers commit working code regularly**. Marks will be awarded for good git practices in assignments. Commit your code for each method as you complete it, and push the commit to Github. Never use Github's `Upload File` functionality to upload code.
On your first commmit git will prompt you to set up your username and email address for commit tracking. You can do this using the commands below:
```
 git config --global user.email "you@example.com"
 git config --global user.name "Your Name"
```

## Reviewing Autograder output
Github Classroom's autograder has been set up to run a suite of automated tests on your lab/assignment submissions on every commit to verify that:
- your code compiles
- your code runs
- your code does what it's supposed to do

The autograder output can give useful feedback on what's wrong with your code, so it's very important to review this feedback.
- On the main repo page in Github you'll see either a :x: or :heavy_check_mark: beside the latest commit:

![image](https://user-images.githubusercontent.com/26874254/134696750-d649ac65-9709-483c-9269-ccc83729ab3f.png)

- Clicking this will open a small window showing feedback on the autograder run for that commit:
  - Github Classroom's autograder is based on [Github Actions](https://docs.github.com/en/actions), Github's built-in CI/CD tooling, which executes a Workflow on each commit. It's not necessary for you to know anything about Github Actions or Workflows, but some of you might be interested.

![image](https://user-images.githubusercontent.com/26874254/134697259-322c2a0a-78cb-4ab5-9422-0a59c43e5c99.png)

- Click on `Details` to go the autograder output for that commit (you'll be taken to the `Actions` tab in your repo):

![image](https://user-images.githubusercontent.com/26874254/134697541-557ec64f-5b06-4f48-ba02-0dfe7b689dd7.png)

- Here you can get detailed information on what went wrong with testing and/or building your code. This is an excellent opportunity to practice the critically important skill of extracting useful information from error messages. For example, when I scroll up I can see that the test for the `calcGaaPoints` method failed. The expected output from the test data was 20, but the code return 0 (this is because I haven't implemented the method in this example):

![image](https://user-images.githubusercontent.com/26874254/134698078-480bbeeb-ada6-41e3-aebb-e1fc56debe36.png)

- You can use this information to fix problems with your code.

## Summary
At the end of this lab you should be:
- Set up on Github Classroom
- Be able to access your VM on Azure Lab Services
- Know the correct workflow for working on labs and assignments in this module
- Know where to find the autograder output in Github

To recap, the workflow you should follow for all the labs and assignments in this mmodule is:
- accept the lab/assignment in Github Classroom by clicking the link in Moodle
- start and connect to your VM in Azure Lab Services
- clone the repo created for you in Github Classroom to your Azure VM
- open the starter code in IntelliJ IDEA and review the instructions
- repeat the steps below until the lab/assignment is completed
  - write code for a method (+ optionally run the relevant test)
  - commit your changes to your git repository
  - push the commit to Github
- Shutdown/disconnect from your VM when you finish a session of work on a lab/assignment


