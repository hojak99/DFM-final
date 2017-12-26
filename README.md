#DFM-Final
<br />

**Project Name** : 미정

**About** : TODO, 일정, 가계부, 일기 종합 집합소 웹앱

**Members** :

- **Front-End** : 최병광, 김소연, 박수빈
- **Back-End** : 바지년, 권장호(매니저)
- **Designers** : 양정안(부매니저), 오나경

<br /><br />


####우리 프로젝트 IA

  Level 0     | Level 1     | Level 2       |  Level 3       |
| :-------------------- | :------------------ | :---------------- | :------------------- |
|  **Splash Screen** : 서비스의 간단 명료한 설명 및 회원가입 버튼 <br />그리고 SKIP 옵션을 줌         | **홈** - Today View<br /><br /> **Description** : Calendar의 오늘 날짜를 보여주는 화면. <br /><br />*If user is logged In & with content to show* <br />**Content** :  Todo, Schedule, 가계부, 일기 순으로 대쉬보드 처럼 요약된 정보만 보여줌<br />**Todo** : 내가 아직 해야할 Todo만 보여주고 나의 총 Todo 갯수와 현재 몇개 완료 되었는지 보여줌 (3/4)<br />**Schedule** : 나의 미래 일정 2-3개만 보여주고 나의 총 일정 갯수와 남은 일정 갯수 보여줌(3/6)<br />**가계부** : 내가 등록한 가계부 총 액<br />**일기** : 나의 기분, 타이틀, 자리가 되면 2줄정도 보여주고 나머지 [...] 처리<br /><br /> *If user skipped 회원가입 process && user with no content* <br />**Content** : 서비스를 돌아볼 수 있도록 각각의 항목별로 (Todo, Schedule, 가계부, 일기) 를 쓰게 유도하는 문구 및 항목을 보여줌 [예: 당신의 오늘 일정은 어떻게 되나요? 혹은 오늘은 얼마를 어디에 쓰셨나요? 등등]      | **Calendar** - Monthly View<br /><br /> **Description** : 캘린더의 달별 형태를 나타내는 화면. <br /> **Content** : 나의 기록이 있는 날에는 어떤 항목의 기록을 남겼는지 간단한 notification 방식으로 보여주고 내가 보고싶은 날짜를 선택할 수 있음 |  **Calendar** - Day View<br /><br /> **Description** : 내가 선택한 날짜의 Day View <br /> **Contents** : 컨텐츠는 메인 홈 화면과 동일
|   |   | **CTA** - 작성하기 / 추가하기<br /><br /> **Description** : 서비스의 핵심 기능 작성하기 <br /> **Content** : 옵션이 4개 (Todo, Schedule, 가계부, 일기) 누르면 각 항목에 해당되는 form으로 이동  | |
|   |   | **Day View** - Todo <br /><br /> **Description** : 클릭한 날짜의 Todo 페이지<br /> **Content** : 내가 작성한 모든 todo 리스트를 보여줌 - <br /> 내가 완료 해야될 todo, 내가 완료한 todo <br/> **CTA** : 그 날의 해야 할 todo 항목 추가하기   |  **Todo 추가하기** <br /><br /> **Content** : 날짜는 내가 있었던 날짜가 default로 선택되어 있음 (날짜 변경 가능) 나의 todo 작성할 수 있는 input <br /> **CTA** : 추가하기 버튼 |
|   |   | **Day View** - Schedule <br /><br /> **Description** : 클릭한 날짜의 Schedule <br /> **Content** : 12AM - 12PM으로 나타나서 스케줄 표식의 방식으로 나의 일정이 정리된 화면 보여줌 <br /> **CTA** : 그 날의 일정 추가하기   |  **Schedule 추가하기** <br /><br /> **Content** : 날짜는 내가 있었던 날짜를 default로 선택되어 있음 (날짜 변경 가능) 나의 일정 작성할 수 있는 input , 시간을 선택하고 들어왔으면 선택된 시간을 보여주고 (수정 가능) 아니면 선택 가능, 장소, 누구 및 추가하기 버튼 |
|   |   | **Day View** - 가계부 <br /><br /> **Description** : 클릭한 날짜의 가계부 <br /> **Content** 내가 등록 가계부 총 정리 및 통계 <br /> **CTA** : 그 날의 가계부 항목 추가하기    |   |
|   |   | **Day View** - 일기 <br /><br /> **Description** : 클릭한 날짜의 일기 <br /> **Content** : 이 날의 나의 기분, 날씨, 타이틀, 그리고 나의 이야기를 보여주는 화면 <br /> **CTA**내가 쓴 글 수정하기 혹은 삭제하기 |   |
|   |   | (프로필)  | (프로필 수정)  |
