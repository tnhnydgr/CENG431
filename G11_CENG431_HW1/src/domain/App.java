package domain;

public class App {

	public static void main(String[] args) {
		IProjectPortfolioManager mediator = new ProjectPortfolioManager();
		mediator.start();
	}

}

/*
Data data = new Data();
//data.testWriteJSON();
//data.myTry();
//data.template();


List<Activity> activityList = new ArrayList<Activity>();
Activity act = new Activity(5, "desc", "1.1.1", "deliv");
act.setTaskList(taskList);
activityList.add(act);
activityList.add(act);
activityList.add(act);
activityList.add(act);
activityList.add(act);

List<Project> projectList = new ArrayList<Project>();
Project prj = new Project("pName", "descr", "1.23.13");
prj.setActivityList(activityList);

projectList.add(prj);
projectList.add(prj);
projectList.add(prj);
projectList.add(prj);
projectList.add(prj);
projectList.add(prj);

String datam = data.saveProjects(projectList);

System.out.println(datam);
data.writeFile("", datam);

List<Project> a = data.loadProjects(data.readFile(""));
System.out.println(a);

//System.out.println(data.buildActivitys(activityList));
*/
/*
List<Task> taskList =new ArrayList<Task>();
Task tsk = new Task("desc","startDate",2);
taskList.add(tsk);
Task tsk2 = new Task("desc","startDate",2);
taskList.add(tsk);
Task tsk3 = new Task("desc","startDate",2);
taskList.add(tsk);
Task tsk4 = new Task("desc","startDate",2);
taskList.add(tsk);


List<Activity> activityList = new ArrayList<Activity>();
Activity act = new Activity("desc", "1.1.1", "something");
act.setTaskList(((ArrayList<Task>)taskList));
activityList.add(act);
activityList.add(act);
activityList.add(act);
activityList.add(act);
activityList.add(act);

List<Project> projectList = new ArrayList<Project>();
Project prj = new Project("pName", "descr", "1.23.13");
prj.setActivityList(activityList);

projectList.add(prj);
projectList.add(prj);
projectList.add(prj);
projectList.add(prj);
projectList.add(prj);
projectList.add(prj);


DataHandler data = new DataHandler();

List<IResource> resourceList = new ArrayList<IResource>();
IResource emp = new Employee("eName", "eDescription",10);
IResource csnt = new Consultant("cName", "cDescription",5);
emp.setTaskList(taskList);
csnt.setTaskList(taskList);


resourceList.add(emp);
resourceList.add(csnt);
resourceList.add(emp);
resourceList.add(csnt);
resourceList.add(emp);
resourceList.add(csnt);

data.writeFile("Projects-2018-10-31.json", data.mergeJson(projectList, resourceList));


List<Project> projectListLoad = null;
List<IResource> resourceListLoad = null;

data.splitJson(data.readFile("Projects-2018-10-31.json"), projectListLoad, resourceListLoad);

data.findLatestFile();

System.out.println(data.findLatestFile());

*/
