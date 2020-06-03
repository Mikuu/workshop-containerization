FROM node:14

RUN mkdir -p /usr/app
COPY . /usr/app

WORKDIR /usr/app
RUN npm install

EXPOSE 3000
ENTRYPOINT ["node", "app.js"]

