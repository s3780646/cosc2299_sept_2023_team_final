import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';


function SearchBar() {
    const navigate = useNavigate();
    const [searchTerm, setSearchTerm] = useState('');


    const handleSearch = () => {
        navigate("/productsearch/" + searchTerm, { state: { productName: searchTerm } });

    };

    return (
        <div>
            <input
                type="text"
                placeholder="Search..."
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
            />
            <button onClick={() => handleSearch()}>Search</button>
        </div>
    );
}

export default SearchBar;
