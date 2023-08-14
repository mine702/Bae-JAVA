# [Bronze III] 일우는 야바위꾼 - 20361 

[문제 링크](https://www.acmicpc.net/problem/20361) 

### 성능 요약

메모리: 37856 KB, 시간: 372 ms

### 분류

구현, 시뮬레이션

### 문제 설명

<p style="user-select: auto;">전설의 야바위꾼 일우는 Shell Game으로 야바위를 한다. Shell Game은 다음과 같은 절차로 진행된다.</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">진행자가 <em style="user-select: auto;">N</em>개의 컵을 일렬로 놓고, 그 중 <em style="user-select: auto;">X</em>번째 컵에 공을 숨겨둔다.</li>
	<li style="user-select: auto;">임의의 서로 다른 두 컵의 위치를 맞바꾼다. 이 항목을 <em style="user-select: auto;">K</em>번 수행한다. 만약, 공을 숨겨둔 컵을 움직인다면 공도 그 컵을 따라서 움직인다.</li>
	<li style="user-select: auto;">참가자는 몇 번째 컵에 공이 숨겨져 있는지 추측한다.</li>
	<li style="user-select: auto;">그 컵에 공이 숨겨져 있다면 참가자가, 그렇지 않다면 진행자가 이긴다.</li>
</ol>

<p style="text-align: center; user-select: auto;"><img alt="" src="https://upload.acmicpc.net/3a3fbee0-2322-4556-a978-1732f9da439f/-/preview/" style="height: 225px; width: 300px; user-select: auto;"></p>

<p style="user-select: auto;">수혁이는 Shell Game을 잘하고 싶다. 하지만, 일우가 진행자라면 무슨 수를 써도 이길 수 없어 수혁이는 일우의 사기도박을 의심하고 있다. 현재 우리는 수혁과 일우가 진행한 Shell Game의 모든 기록을 입수했다. 이를 바탕으로, 일우가 사기도박을 하지 않았다면 공이 몇 번째 컵에 있는지 알려주는 프로그램을 작성하자.</p>

### 입력 

 <p style="user-select: auto;">첫째 줄에 <em style="user-select: auto;">N </em>(3 ≤ <em style="user-select: auto;">N</em> ≤ 200,000), <em style="user-select: auto;">X </em>(1 ≤ <em style="user-select: auto;">X</em> ≤ <em style="user-select: auto;">N</em>), <em style="user-select: auto;">K </em>(1 ≤ <em style="user-select: auto;">K</em> ≤ 100,000)가 공백으로 구분되어 주어진다.</p>

<p style="user-select: auto;">둘째 줄부터 <em style="user-select: auto;">K</em>개의 줄에는 순서대로 바꾼 두 컵의 위치 <em style="user-select: auto;">A</em><sub style="user-select: auto;"><em style="user-select: auto;">i</em>, </sub><em style="user-select: auto;">B<sub style="user-select: auto;">i </sub></em>(1 ≤ <em style="user-select: auto;">A<sub style="user-select: auto;">i</sub></em>, <em style="user-select: auto;">B<sub style="user-select: auto;">i</sub></em> ≤ <em style="user-select: auto;">N</em>, <em style="user-select: auto;">A<sub style="user-select: auto;"><sup style="user-select: auto;">i</sup></sub></em> ≠ <em style="user-select: auto;">B<sub style="user-select: auto;">i</sub></em>)가 공백으로 구분되어 주어진다.</p>

<p style="user-select: auto;">주어지는 모든 입력은 정수다.</p>

### 출력 

 <p style="user-select: auto;">일우가 사기도박을 하지 않았다면, 공이 몇 번째 위치의 컵에 있어야 하는지 정수로 출력하시오.</p>

