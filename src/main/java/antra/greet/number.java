package antra.greet;

import java.util.List;

public class number {
int totalNum;
List<String> SubList;
public number(int totalNum, List<String> SubList){
	this.totalNum=totalNum;
	this.SubList=SubList;
}
public int getTotalNum() {
	return totalNum;
}
public void setTotalNum(int totalNum) {
	this.totalNum = totalNum;
}
public List<String> getSubList() {
	return SubList;
}
public void setSubList(List<String> subList) {
	SubList = subList;
}
}
