import React, { useState } from "react";
import axios from "axios";

import * as S from "./styles";
import { DropzoneArea } from "material-ui-dropzone";

const App = () => {

  const [files, setFiles] = useState([]);

  const handleUploadFiles = (files) => {
    setFiles([...files, files]);
  };

  const handleSubmitButtonClick = async () => {
    console.log(files.length);
    try {

      const headers = {
        'Content-type': 'multipart/form-data',
      }
      const formData = new FormData();
      files.map(file => formData.append("images", file));
      const data = await axios.post(
        "http://localhost:8000/api/v1/files",
        formData,
        { headers });
      console.log(data);
    } catch (error) {
      console.log(error);
    }
  }

  return (
    <S.Conatiner>
      <div style={{ width: "80%" }}>
        <DropzoneArea onChange={handleUploadFiles} />
      </div>
      <br /> <br /> <br /><br /> <br /> <br />
      <button onClick={handleSubmitButtonClick}>서버로 전송</button>
    </S.Conatiner>
  );
}

export default App;
