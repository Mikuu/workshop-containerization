import time
from selenium import webdriver
from selenium.webdriver.chrome.options import Options

options = Options()
options.add_argument("no-sandbox")
options.add_argument("headless")
options.add_argument("start-maximized")
options.add_argument("window-size=1900,1080")

driver = webdriver.Chrome(executable_path='./chromedriver', options=options)  # Optional argument, if not specified will search path.
driver.get('https://en.wikipedia.org/wiki/Main_Page')
driver.save_screenshot('wiki.png')
driver.quit()
