FROM node:16-alpine

WORKDIR /app

COPY package*.json .

RUN npm install

COPY src .

EXPOSE 3333

CMD ["npm", "start"]