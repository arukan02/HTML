function compare(){
	var a=document.getElementById("other").value;
	var answer = (a>270203917) ? "人口が多い国はあなたのお国です!":"人口が多い国は私の国です!";
	document.getElementById("answer").innerHTML = answer;
}