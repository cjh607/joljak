import { useEffect, useState } from 'react'

import axios from 'axios';

const App=()=> {
    // 자격증 정보를 객체로 저장
    const [data, setdata] = useState<{ id: number; name: string }[]>([]);
    useEffect(() => {
        axios.get<{ id: number; name: string }[]>('http://localhost:8080/api/data')
            .then((response)=>{
                console.log("받음:",response.data);
                setdata(response.data);
            })
            .catch();
    }, []);
    return (
        <div>
        <h1>12222222</h1>
            <h2>
                
            </h2>
            <ul>
                {data.map(depart => (
                    <h3 key={depart.id}>{depart.id}, {depart.name}</h3>
                ))}

            </ul>


        </div>
    );
}

export default App;
