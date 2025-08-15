# [Bronze II] KOREA 문자열 만들기 - 30700 

[문제 링크](https://www.acmicpc.net/problem/30700) 

### 성능 요약

메모리: 14092 KB, 시간: 104 ms

### 분류

구현, 그리디 알고리즘, 문자열

### 제출 일자

2025년 8월 15일 22:11:06

### 문제 설명

<p>고려대학교의 영문 이름은 <strong>KOREA UNIVERSITY</strong>이다.</p>

<p>영어 알파벳 대문자 <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>K</code></span>, <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>O</code></span>, <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>R</code></span>, <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>E</code></span>, <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>A</code></span>로만 이루어진 문자열 $S$가 주어진다. $S$에서 $0$개 이상의 문자를 지웠을 때 “KOREAKOREAKOR” 처럼 ‘K’로 시작하고 각 글자가 ‘K’, ‘O’, ‘R’, ‘E’, ‘A’ 순서로 반복되는 문자열을 만들려고 한다. 이를 <strong>KOREA 문자열</strong>이라고 하자.</p>

<p>문자열이 주어졌을 때, $0$개 이상의 문자를 지워서 만들 수 있는 가장 긴 KOREA 문자열의 길이를 구하여라.</p>

### 입력 

 <p>첫 번째 줄에 문자열 $S$가 주어진다. $S$는 영어 알파벳 대문자 <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>K</code></span>, <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>O</code></span>, <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>R</code></span>, <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>E</code></span>, <span style="color: rgb(231, 76, 60); --darkreader-inline-color: var(--darkreader-text-e74c3c, #e95849);" data-darkreader-inline-color=""><code>A</code></span>로만 이루어져 있으며, 문자열의 길이는 $10$ 이상 $1\,000$ 이하이다.</p>

### 출력 

 <p>첫 번째 줄에 만들 수 있는 가장 긴 KOREA 문자열의 길이를 출력한다.</p>

