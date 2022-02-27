FROM python:3.9-alpine

WORKDIR /api

COPY requirements.txt .

RUN pip install -r requirements.txt

COPY src src

CMD ["python", "src/main.py"]
