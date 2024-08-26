const express = require('express')
const app = express()

app.get('/', (req, res) => {
  res.sendFile('/Users/yunseokgyu/Develop/Hackathon/hg-2024-Woowa-Siblings/canbus-web/main/main.html')
})

app.get('/auth/login', (req, res) => {
  res.sendFile('/Users/yunseokgyu/Develop/Hackathon/hg-2024-Woowa-Siblings/canbus-web/auth/signin/signin.html')
})

app.get('/auth/register', (req, res) => {
  res.sendFile('/Users/yunseokgyu/Develop/Hackathon/hg-2024-Woowa-Siblings/canbus-web/auth/signup/signup.html')
})

app.get('/map', (req, res) => {
  res.sendFile('/Users/yunseokgyu/Develop/Hackathon/hg-2024-Woowa-Siblings/canbus-web/kakaomap/map.html')
})

app.get('/sheet', (req, res) => {
  res.sendFile('/Users/yunseokgyu/Develop/Hackathon/hg-2024-Woowa-Siblings/canbus-web/sheet/sheet.html')
})

app.listen(3000)
